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
    private String name;
    private String logo;
    private String desc;
    private String repository;
    private String team;
    private String home;

    public CardItem() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

    public String getDesc() {
        return desc;
    }

    public String getRepository() {
        return repository;
    }

    public String getTeam() {
        return team;
    }

    public String getHome() {
        return home;
    }
}
