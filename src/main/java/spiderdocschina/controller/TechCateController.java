package spiderdocschina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;
import spiderdocschina.dao.CardItemDAO;
import spiderdocschina.entity.CardItem;
import spiderdocschina.entity.TechCate;
import spiderdocschina.utils.JsonResult;

import javax.smartcardio.Card;
import java.util.List;

@RestController
@RequestMapping(value="techCate")
@CrossOrigin
public class TechCateController {
    @Autowired
    private MongoTemplate mongoTemplate;
@GetMapping(value="")
    public JsonResult list(){
        List<TechCate> techCateList = (List<TechCate>) mongoTemplate.findAll(TechCate.class,"DocsChina");
        return new JsonResult(true,techCateList);
    }

}
