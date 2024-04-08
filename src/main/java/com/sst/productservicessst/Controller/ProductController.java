package com.sst.productservicessst.Controller;


import com.sst.productservicessst.Dtos.FakeStoreDto;
import com.sst.productservicessst.Models.Product;
import com.sst.productservicessst.Services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        throw new RuntimeException("tumshe nahi huga");
//        return productService.getProductById(id);
    }
}
