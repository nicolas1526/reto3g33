package com.grupog33.reto3.controller;


import com.grupog33.reto3.model.MessageMoldel;
import com.grupog33.reto3.model.ReservationMoldel;
import com.grupog33.reto3.service.MessageService;
import com.grupog33.reto3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @GetMapping("/all")
    public List<ReservationMoldel> obtener(){
        return  reservationService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ReservationMoldel reservation){
        reservationService.guardar(reservation);
    }
}
