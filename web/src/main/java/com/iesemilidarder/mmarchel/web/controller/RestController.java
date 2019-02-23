package com.iesemilidarder.mmarchel.web.controller;

import com.iesemilidarder.mmarchel.core.data.Flights;
import com.iesemilidarder.mmarchel.web.service.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    // Ver todos los vuelos
    @GetMapping("/flights")
    public List<Flights> getAllFlights(){
        return Service.getAllFlights();
    }

    // Ver vuelo por id
    @GetMapping ("/flight/{id}")
    public Flights getFlights(@PathVariable String id){
        return Service.getFlightsById(id);
    }

    // Añadir vuelo
    @PostMapping("/flight")
    public void addFlight(@RequestBody Flights flight){
        Service.addFlights(flight);
    }

    //Actualizar vuelo
    @PutMapping("/flight/{id}")
    public void updateProduct(@RequestBody Flights flights, @PathVariable String id){
        Service.updateFlights(flights, id);
    }

    //Borrar vuelo
    @DeleteMapping("/flight/{id}")
    public void deleteFlights(@PathVariable String id){
        Service.deleteFlights(id);
    }


}
