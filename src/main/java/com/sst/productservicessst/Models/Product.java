package com.sst.productservicessst.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long  id;
    private String tittle;
    private String description;
    private Double price;
    private Category category;
    private String image;

}
