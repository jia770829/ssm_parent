package com.heima.controller;

import com.heima.domain.Product;
import com.heima.service.ProductService.ProductService;
import com.sun.xml.internal.messaging.saaj.util.SAAJUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.List;

/**
 * 产品的管理
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    /**
     * 查询所有的产品信息
     */
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        //1、创建一个modelAndView对象
        ModelAndView modelAndView=new ModelAndView();
        //2、调用service层
        List<Product> listProduct=productService.findAll();
        for (Product product : listProduct) {
            System.out.println(product);
        }
        
        //3、将得到的结果封装到modelAndView对象中
        modelAndView.addObject("listProduct",listProduct);
        //4、设置返回的页面
        modelAndView.setViewName("product-list");
        return modelAndView;
    }

    @RequestMapping("/add.do")
    public String add(Product product){
        //创建一个modelAndView对象
        ModelAndView modelAndView=new ModelAndView();
        //调用service层进行添加
        productService.add(product);
        //设置返回页面
        return "redirect:/product/findAll.do";

    }

    /**
     * 根据id值来进行修改，先是修改数据的回显
     * @return
     */
    @RequestMapping("/updateUI")
    public ModelAndView update(@RequestParam(value = "productId")String productId){
        ModelAndView modelAndView=new ModelAndView();
        //1、根据前端传来的参数进行查找到对应的记录
        Product product=productService.findById(productId);
        //2.将查询的数据在页面中展示出来
        modelAndView.addObject("product",product);
        //3设置返回的页面
        modelAndView.setViewName("product-update");
        return modelAndView;

    }

    /**
     * 修改操作
     */
    @RequestMapping("/update.do")
    public String update(Product product){//前端传来的属性，因为是和实体类中是一一对应的，所以就可以直接使用对象来进行接收了
        productService.update(product);
        return "redirect:/product/findAll.do";
    }


}
