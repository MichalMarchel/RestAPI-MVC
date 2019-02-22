package com.iesemilidarder.mmarchel.web.controller;

import com.iesemilidarder.mmarchel.core.DataHelper;
import com.iesemilidarder.mmarchel.core.data.Flights;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    // All Products

    @GetMapping(value = "/all")
    public List<Flights> getAll(){
        return DataHelper.getAll();
    }

    @GetMapping(value = "/get/{id}")
    public List<Flights> getId(@PathVariable("id") String id){
        return DataHelper.getId(id);
    }



}
