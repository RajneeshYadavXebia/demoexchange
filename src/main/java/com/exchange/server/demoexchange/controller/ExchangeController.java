package com.exchange.server.demoexchange.controller;

import com.exchange.server.demoexchange.entity.StockEntity;
import com.exchange.server.demoexchange.model.Stock;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface ExchangeController {

    /**
     * This method returns stock Details based on stock id
     * @param stockId
     * @return Stock
     */
    @RequestMapping( value = "/stock/{id}" , method = RequestMethod.GET)
    Stock getStock(String stockId);

    /**
     * This method returns stock Details based on stock id
     * @param stockId
     * @return Stock
     */
    @RequestMapping( value = "/stockById/{id}" , method = RequestMethod.GET)
    Stock getStockById(String stockId);

    /**
     * This method makes entry of stock in DB.
     * @param stock
     * @return status
     */
    @RequestMapping (value = "/stock" , method = RequestMethod.POST)
    String createStock(@RequestBody Stock stock);

    /**
     * This method makes entry of stock in DB.
     * @param stock
     * @return status
     */
    @RequestMapping (value = "/saveStaock" , method = RequestMethod.POST)
    String saveStock(@RequestBody Stock stock);

    /**
     *  This method makes updates entry of stock
     * @param stock
     * @return Stock
     */
    @RequestMapping (value = "/stock" , method = RequestMethod.PUT)
    Stock updateStock(@RequestBody Stock stock);
}
