package com.grupog33.reto3.controller;


import com.grupog33.reto3.model.ReservationMoldel;
import com.grupog33.reto3.model.ScoreMoldel;
import com.grupog33.reto3.service.ReservationService;
import com.grupog33.reto3.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    @GetMapping("/all")
    public List<ScoreMoldel> obtener(){
        return  scoreService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ScoreMoldel score){
        scoreService.guardar(score);
    }
}
