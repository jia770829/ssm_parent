package com.heima.dao;

import com.heima.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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

    /**
     * 添加操作
     */
    @Insert("insert into product values(#{id},#{productNum},#{productName},#{cityName},#{departureTime}," +
            "#{productPrice},#{productDesc},#{productStatus})")
    void add(Product product);


    /**
     * 根据id值进行查询
     * @param productId
     * @return
     */
    @Select("select * from product where id =#{productId}")
    Product findById(String productId);

    /**
     * 修改操作
     * @param product
     */
    @Update("update product set productNum=#{productNum},productName=#{productName},cityName=#{cityName},departureTime=#{departureTime}, productPrice=#{productPrice},productDesc=#{productDesc}, productStatus=#{productStatus} where id = #{id}")
    void update(Product product);
}
