package com.exchange.server.demoexchange.Service;

import com.exchange.server.demoexchange.Repository.StockEntityRepository;
import com.exchange.server.demoexchange.entity.StockEntity;
import com.exchange.server.demoexchange.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ExchangeService {
    /**
     *
     * @param stockId
     * @return
     */
    Stock getStock(String stockId);
    String createStock(Stock stock);
    Stock updateStock(Stock stock);
    Stock getStockById(String id);
    String saveStockEntity(Stock stock);
}
