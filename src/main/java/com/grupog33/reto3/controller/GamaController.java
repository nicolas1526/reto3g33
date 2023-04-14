package com.grupog33.reto3.controller;


import com.grupog33.reto3.model.GamaMoldel;
import com.grupog33.reto3.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Gama")
public class GamaController {

    @Autowired
    GamaService gamaService;

    @GetMapping("/all")
    public List<GamaMoldel> obtener(){
        return  gamaService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody GamaMoldel gama){
        gamaService.guardar(gama);
    }
}
