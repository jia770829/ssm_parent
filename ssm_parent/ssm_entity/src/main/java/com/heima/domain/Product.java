package com.heima.domain;

/**
 * 产品表
 */
public class Product {
    private Long id;// 主键 ，对应数据库中的是bigint类型
    private String productNum;// 产品编号 varchar
    private String productName;// 产品名称 varchar
    private String cityName;// 城市名称 varchar
    private String departureTime;// 出发城市 varchar
    private Double productPrice;// 产品价格 numeric(8,2)
    private String productDesc;// 产品描述 varchar
    private Integer productStatus;// 产品状态 （0关闭 1开启）

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productNum='" + productNum + '\'' +
                ", productName='" + productName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", productPrice=" + productPrice +
                ", productDesc='" + productDesc + '\'' +
                ", productStatus=" + productStatus +
                '}';
    }
}
