package spiderdocschina.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import spiderdocschina.entity.CardItem;
@Component
public interface CardItemDAO extends JpaRepository<CardItem,Long> {

}
