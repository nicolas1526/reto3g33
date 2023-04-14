package com.grupog33.reto3.controller;


import com.grupog33.reto3.model.GamaMoldel;
import com.grupog33.reto3.model.MessageMoldel;
import com.grupog33.reto3.service.GamaService;
import com.grupog33.reto3.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/all")
    public List<MessageMoldel> obtener(){
        return  messageService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody MessageMoldel message){
        messageService.guardar(message);
    }
}
