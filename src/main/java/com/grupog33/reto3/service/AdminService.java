package com.grupog33.reto3.service;

import com.grupog33.reto3.model.AdminMoldel;
import com.grupog33.reto3.model.ScoreMoldel;
import com.grupog33.reto3.repository.AdminRepository;
import com.grupog33.reto3.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public List<AdminMoldel> obtener(){
        return adminRepository.findAll();
    }

    public void guardar(AdminMoldel admin){
        adminRepository.save(admin);
    }
}
