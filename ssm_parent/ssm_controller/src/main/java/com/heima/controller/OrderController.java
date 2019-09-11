package com.heima.controller;

import com.heima.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 订单
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    //注入service
    @Autowired
    private OrderService orderService;

    /**
     * 添加操作
     */
    @RequestMapping("/add")
    public void add(){

    }


    /**
     *
     */


}
