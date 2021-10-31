package spiderdocschina.service;

import spiderdocschina.entity.CardItem;

import java.util.List;

public interface CardItemService {
    void saveCardInfo(CardItem cardItem);
    List<CardItem> findAll();
}
