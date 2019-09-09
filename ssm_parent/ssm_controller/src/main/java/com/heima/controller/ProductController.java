package com.heima.controller;

import com.heima.domain.Product;
import com.heima.service.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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

}
