package com.heima.service.impl;

import com.heima.dao.OrderMapper;
import com.heima.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    //注入dao层
    @Autowired
    private OrderMapper orderMapper;
}
