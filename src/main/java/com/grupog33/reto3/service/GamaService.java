package com.grupog33.reto3.service;

import com.grupog33.reto3.model.ClientMoldel;
import com.grupog33.reto3.model.GamaMoldel;
import com.grupog33.reto3.repository.ClientRepository;
import com.grupog33.reto3.repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {

    @Autowired
    GamaRepository gamaRepository;

    public List<GamaMoldel> obtener(){
        return gamaRepository.findAll();
    }

    public void guardar(GamaMoldel gama){
        gamaRepository.save(gama);
    }
}
