package com.springboot.controller;

import com.springboot.Mapper.ProductMapper;
import com.springboot.Response.Response;
import com.springboot.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    @GetMapping("/product/get/{id}")
    public Object getProduct(@PathVariable("id") Integer id) {
        Product product = productMapper.getById(id);
        if (product != null) {
            return new Response(200, "ok", product);
        }
        return new Response(500, "fail", "error fc");
    }

    @PostMapping("/product/add")
    public Object add(Product product) {
        try {
            productMapper.add(product);
        } catch (Exception err) {
            return new Response(500, "faill", err.getMessage());
        }
        return new Response(200, "ok");
    }

    @DeleteMapping("/product/{id}")
    public Object delete(@PathVariable("id") Integer id) {
        try {
            productMapper.deleteByID(id);
        } catch (Exception err) {
            return new Response(500, "faill", err.getMessage());
        }
        return new Response(200, "ok");
    }

    @PutMapping("/product/update")
    public Object updata(Product product) {
        Integer id=   productMapper.update(product);

            return new Response(200, "ok", id);

    }

    @GetMapping("/product/query")
    public Object getListProduct() {
        List<Product> products = productMapper.queryByLists();
        if (products != null) {
            return new Response(200, "ok", products);
        }
        return new Response(500, "fail");

    }

}
