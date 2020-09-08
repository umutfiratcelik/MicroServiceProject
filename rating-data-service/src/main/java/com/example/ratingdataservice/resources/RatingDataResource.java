package com.example.ratingdataservice.resources;

import com.example.ratingdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {

@RequestMapping("/{saleId}")
    public Rating getRating(@PathVariable("saleId") String saleId){

    return new Rating(saleId,4);
}

}
