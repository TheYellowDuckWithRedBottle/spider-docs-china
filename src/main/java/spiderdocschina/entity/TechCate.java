package spiderdocschina.entity;

import com.alibaba.fastjson.JSONObject;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.List;

@Document("DocsChina")
public class TechCate {
    @Id
    private String id;
    @Field("_updateTime")
    private String _updateTime;
    @Field("lable")
    private String label;
    @Field("list")
    private List<CardItem> cardList;
    @Field("name")
    private String name;

    public TechCate() {
    }

    public String getId() {
        return id;
    }

    public String get_updateTime() {
        return _updateTime;
    }

    public String getLabel() {
        return label;
    }

    public List<CardItem> getCardList() {
        return cardList;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void set_updateTime(String _updateTime) {
        this._updateTime = _updateTime;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setCardList(List<CardItem> cardList) {
        this.cardList = cardList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TechCate(String id, String _updateTime, String label, List<CardItem> cardList, String name) {
        this.id = id;
        this._updateTime = _updateTime;
        this.label = label;
        this.cardList = cardList;
        this.name = name;
    }
    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}
