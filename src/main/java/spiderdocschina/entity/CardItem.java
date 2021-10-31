package spiderdocschina.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cardItem")
public class CardItem {

    @Id
    @GeneratedValue
    private Long id;
    private String labelName;
    private String imgUrl;
    private String description;
    private String toolLink;
    private Boolean hasRibbon;

    public CardItem() {
    }

    public CardItem(String labelName, String imgUrl, String description, String toolLink, Boolean hasRibbon) {
        this.labelName = labelName;
        this.imgUrl = imgUrl;
        this.description = description;
        this.toolLink = toolLink;
        this.hasRibbon = hasRibbon;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setToolLink(String toolLink) {
        this.toolLink = toolLink;
    }

    public void setHasRibbon(Boolean hasRibbon) {
        this.hasRibbon = hasRibbon;
    }
}
