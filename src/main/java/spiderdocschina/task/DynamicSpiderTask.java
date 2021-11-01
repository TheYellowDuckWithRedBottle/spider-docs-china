package spiderdocschina.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import spiderdocschina.utils.DynamicHttpUtils;
@Component
public class DynamicSpiderTask {
    @Autowired
    private DynamicHttpUtils dynamicHttpUtils=DynamicHttpUtils.getInstance();
    private  static  final String TestUrl = "https://youzan.github.io/vant/#/zh-CN/";
    @Scheduled(fixedDelay = 200*1000)
    public void DynamicHttpResolve(){
        dynamicHttpUtils.setTimeout(30000);
        dynamicHttpUtils.setWaitForBackgroundJS(30000);
        try{
            String htmlPageStr = dynamicHttpUtils.getHtmlPageResponse(TestUrl);
            System.out.println(htmlPageStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
