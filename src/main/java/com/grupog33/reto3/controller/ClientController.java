package com.grupog33.reto3.controller;


import com.grupog33.reto3.model.ClientMoldel;
import com.grupog33.reto3.model.GamaMoldel;
import com.grupog33.reto3.service.ClientService;
import com.grupog33.reto3.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/all")
    public List<ClientMoldel> obtener(){
        return  clientService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ClientMoldel client){
        clientService.guardar(client);
    }
}
