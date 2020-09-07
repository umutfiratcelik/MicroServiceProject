package com.example.salecatalogueservice.resources;


import com.example.salecatalogueservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class SaleCatalogResource {
    @RequestMapping("/{catalogId}")
    public List<CatalogItem> getCatalog(@PathVariable("catalogId") String catalogId){

         return Collections.singletonList(
                 new CatalogItem("BMW","High tech german car",4)
         );

    }
}
