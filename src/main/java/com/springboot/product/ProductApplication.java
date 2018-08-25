package com.springboot.product;

import com.springboot.Mapper.ProductMapper;
import com.springboot.bean.Product;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//https://blog.csdn.net/pange1991/article/details/81238940 坑
@ComponentScan(basePackages = "com.springboot")
@MapperScan(basePackages = "com.springboot")
public class ProductApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ProductApplication.class, args);
//        context.getBean(ProductMapper.class);
//        ProductMapper productMapper = context.getBean(ProductMapper.class);
//        Product product = new Product();
//        product.setPname("java spring boot");
//        product.setPrice(122d);
//        product.setType("书类");
//        productMapper.add(product);
//        context.close();
    }
}
