package com.grupog33.reto3.controller;


import com.grupog33.reto3.model.AdminMoldel;
import com.grupog33.reto3.model.ScoreMoldel;
import com.grupog33.reto3.service.AdminService;
import com.grupog33.reto3.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/all")
    public List<AdminMoldel> obtener(){
        return  adminService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody AdminMoldel admin){
        adminService.guardar(admin);
    }
}
