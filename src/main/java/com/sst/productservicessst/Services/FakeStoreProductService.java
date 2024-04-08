package com.sst.productservicessst.Services;

import com.sst.productservicessst.Dtos.FakeStoreDto;
import com.sst.productservicessst.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class FakeStoreProductService implements ProductService{
    @Override
    public Product getProductById(Long id) {

        Product product= new Product();

        RestTemplate restTemplate = new RestTemplate();
        FakeStoreDto fakeStoreDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreDto.class);

        product.setId(fakeStoreDto.getId());
        product.setCategory(fakeStoreDto.getCategory());
        product.setDescription(fakeStoreDto.getDescription());
        product.setTittle(fakeStoreDto.getTitle());
        product.setPrice(fakeStoreDto.getPrice());
        product.setImage(fakeStoreDto.getImage());

        return product;
    }
}
