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


public class CardItemTask {
    org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private HttpUtils httpUtils;
    @Autowired
    private CardItemService cardItemService;

//    private  static final ObjectMapper mapper = new ObjectMapper();

    @Scheduled(fixedDelay = 100*1000)
    public  void itemTask() throws Exception {
        String url = "https://docschina.org";
        String html = httpUtils.doGetHtml(url);
        parse(html);
    }
    private  void parse(String html){
        Document doc = Jsoup.parse(html);
        logger.info(String.valueOf(doc));

        Elements titles = doc.select("div.dc-home-card-items");
        for(Element title:titles){
            System.out.println(title);

            CardItem cardItem = new CardItem();
            //cardItem.setDescription(topic);
            cardItemService.saveCardInfo(cardItem);
        }

    }

}
