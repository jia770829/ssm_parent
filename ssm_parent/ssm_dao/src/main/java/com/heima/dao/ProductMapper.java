package com.heima.dao;

import com.heima.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 产品信息
 */
@Repository
public interface ProductMapper {

    /**
     * 查询所有的产品信息
     * @return
     */
    @Select("select * from product")
    public List<Product> findAll();
}
