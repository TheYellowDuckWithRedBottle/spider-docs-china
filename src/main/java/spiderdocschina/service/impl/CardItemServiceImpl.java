package spiderdocschina.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spiderdocschina.dao.CardItemDAO;
import spiderdocschina.entity.CardItem;
import spiderdocschina.service.CardItemService;

import java.util.List;
@Service
public class CardItemServiceImpl implements CardItemService {

    @Autowired
    private CardItemDAO cardItemDAO;
    @Override
    public void saveCardInfo(CardItem cardItem) {
        cardItemDAO.save(cardItem);
    }

    @Override
    public List<CardItem> findAll() {
        return cardItemDAO.findAll();
    }
}
