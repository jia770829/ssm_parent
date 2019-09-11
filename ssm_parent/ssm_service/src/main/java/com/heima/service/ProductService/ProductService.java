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


    /**
     * 添加操作
     * @param product
     */
    void add(Product product);

    /**
     * 根据id值进行查询
     * @param productId
     * @return
     */
    Product findById(String productId);

    /**
     * 修改操作
     * @param product
     */
    void update(Product product);
}
