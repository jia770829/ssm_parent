package com.heima.service.ProductService;

import com.heima.domain.Product;

import java.util.List;

/**
 * 产品信息
 */
public interface ProductService {

    /**
     * 查询所有产品信息
     * @return
     */
    public List<Product> findAll();

}
