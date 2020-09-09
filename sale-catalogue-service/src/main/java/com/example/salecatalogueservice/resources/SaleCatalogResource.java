package com.example.salecatalogueservice.resources;


import com.example.salecatalogueservice.models.CatalogItem;
import com.example.salecatalogueservice.models.Rating;
import com.example.salecatalogueservice.models.Sale;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class SaleCatalogResource {
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        RestTemplate restTemplate =new RestTemplate();


List<Rating> ratings = Arrays.asList(
        new Rating("3696",4),
        new Rating("940,",5),
        new Rating("926535",5)

);

       return ratings.stream().map(rating ->{
           Sale sale =restTemplate.getForObject("http://localhost:8081/sales/" + rating.getSaleId(), Sale.class) ;
        return new CatalogItem(sale.getSaleId(),"saadas",rating.getRating());
       })
           .collect(Collectors.toList());



        ///For each sale ID , call sale info service and get details

        // Put them all together


    }
}
