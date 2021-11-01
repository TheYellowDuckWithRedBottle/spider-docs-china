package spiderdocschina.utils;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.MalformedURLException;
@Component
public class DynamicHttpUtils {
    private int timeout = 20000;
    private  int waitForBackgroundJS = 20000;
    private static DynamicHttpUtils dynamicHttpUtils;

    private DynamicHttpUtils() {
    }
    public static  DynamicHttpUtils getInstance(){
        if(dynamicHttpUtils == null)
            dynamicHttpUtils = new DynamicHttpUtils();
            return dynamicHttpUtils;
    }
    public int getTimeout(){
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getWaitForBackgroundJS() {
        return waitForBackgroundJS;
    }

    public void setWaitForBackgroundJS(int waitForBackgroundJS) {
        this.waitForBackgroundJS = waitForBackgroundJS;
    }
    private static Document parseHtmlToDoc(String html) {
        return removeHtmlSpace(html);
    }

    private static Document removeHtmlSpace(String str) {
        Document doc = Jsoup.parse(str);
        String result = doc.html().replace("&nbsp","");
        return Jsoup.parse(result);
    }
    public String getHtmlPageResponse(String url){
        String result = "";
        final WebClient webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setActiveXNative(false);
        webClient.getOptions().setUseInsecureSSL(true);//忽略ssl认证
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.setAjaxController(new NicelyResynchronizingAjaxController());

        webClient.getOptions().setTimeout(timeout);
        webClient.setJavaScriptTimeout(timeout);

        HtmlPage page=null;
        try{
            page =webClient.getPage(url);
//            page.executeJavaScript().getJavaScriptResult();
        } catch (MalformedURLException e) {
            webClient.close();
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        webClient.waitForBackgroundJavaScript(waitForBackgroundJS);
        System.out.println("==============运行js后");
        result =page.asXml();
        return result;
    }
    public Document getHtmlPageResponseAsDocument(String url){
        return parseHtmlToDoc(getHtmlPageResponse(url));
    }

}
