package com.globomatics.bike.controllers;
import java.util.ArrayList;
import java.util.List;
import com.globomatics.bike.models.Bike;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/bikes")
public class BikesController {

    @GetMapping
    public List<Bike> list() {
    List<Bike>bikes = new ArrayList<>();
    return  bikes;

    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike){

    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Bike get(@PathVariable("id") long id ){
        return new Bike();
    }


}
