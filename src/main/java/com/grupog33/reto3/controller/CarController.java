package com.grupog33.reto3.controller;


import com.grupog33.reto3.model.CarMoldel;
import com.grupog33.reto3.model.GamaMoldel;
import com.grupog33.reto3.service.CarService;
import com.grupog33.reto3.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/all")
    public List<CarMoldel> obtener(){
        return  carService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody CarMoldel car){
        carService.guardar(car);
    }
}
