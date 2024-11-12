package com.coffee.api.controller;

import com.coffee.api.models.Coffee;
import com.coffee.api.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    @Autowired
    CoffeeRepository coffeeRepository;

    @GetMapping (value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Coffee> getalllCoffee() {
               return coffeeRepository.findAll();
    }

    @PostMapping(value = "/createCoffee" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Coffee createNewCoffee(@RequestBody Coffee coffee){

        Coffee createCoffee = new Coffee();
    }
}
