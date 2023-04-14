package com.grupog33.reto3.service;

import com.grupog33.reto3.model.ReservationMoldel;
import com.grupog33.reto3.model.ScoreMoldel;
import com.grupog33.reto3.repository.ReservationRepository;
import com.grupog33.reto3.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    ScoreRepository scoreRepository;

    public List<ScoreMoldel> obtener(){
        return scoreRepository.findAll();
    }

    public void guardar(ScoreMoldel score){
        scoreRepository.save(score);
    }
}
