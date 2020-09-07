package com.example.saleinfoservice.resources;

import com.example.saleinfoservice.models.Sale;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sales")
public class SaleResources {

    @RequestMapping("/{saleId}")
    public Sale getSaleInfo(@PathVariable("saleId") String saleId)
    {
return new Sale(89793238,5000,2012,true,"5 series");


    }
}
