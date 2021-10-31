package spiderdocschina.task;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import spiderdocschina.entity.CardItem;
import spiderdocschina.service.CardItemService;
import spiderdocschina.utils.HttpUtils;

@Component
public class CardItemTask {
    org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private HttpUtils httpUtils;
    @Autowired
    private CardItemService cardItemService;

//    private  static final ObjectMapper mapper = new ObjectMapper();

    @Scheduled(fixedDelay = 100*1000)
    public  void itemTask() throws Exception {
        String url = "http://www.baidu.com";
        String html = httpUtils.doGetHtml(url);
        parse(html);
        System.out.println("著去完成");

    }
    private  void parse(String html){
        Document doc = Jsoup.parse(html);
        logger.info(String.valueOf(doc));

        Elements spuEles = doc.select("div .ctxt");
        for(Element spuEle:spuEles){
            String topic =spuEle.select("[target]").attr("title");

            CardItem cardItem = new CardItem();
            cardItem.setDescription(topic);
            cardItemService.saveCardInfo(cardItem);
        }

    }

}
