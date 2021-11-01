package spiderdocschina;

import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import spiderdocschina.utils.DynamicHttpUtils;
@SpringBootTest
public class JunitTestCase {
    private  static final String TestUrl = "https://docschina.org";
    @Test
    public void testGetHtmlPageResponse(){
        DynamicHttpUtils dynamicHttpUtils = DynamicHttpUtils.getInstance();
        dynamicHttpUtils.setTimeout(30000);
        dynamicHttpUtils.setWaitForBackgroundJS(30000);

        try{
            String htmlPageStr = dynamicHttpUtils.getHtmlPageResponse(TestUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testGetHtmlPageResponseAsDocument(){
        DynamicHttpUtils dynamicHttpUtils = DynamicHttpUtils.getInstance();
        dynamicHttpUtils.setTimeout(30000);
        dynamicHttpUtils.setWaitForBackgroundJS(30000);
        try{
            Document htmlPageStr = dynamicHttpUtils.getHtmlPageResponseAsDocument(TestUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
