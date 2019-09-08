package com.heima.service.impl;

import com.heima.dao.ProductMapper;
import com.heima.domain.Product;
import com.heima.service.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 产品信息
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    /**
     * 查询所有的产品信息
     * @return
     */
    @Override
    public List<Product> findAll() {
        //调用dao层，完成查询
        List<Product> listProduct=productMapper.findAll();
        return listProduct;
    }
}
