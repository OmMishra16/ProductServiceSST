package com.sst.productservicessst.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreDto {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String image;
    private String Category;
}
