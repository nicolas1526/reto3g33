package com.grupog33.reto3.service;

import com.grupog33.reto3.model.CarMoldel;
import com.grupog33.reto3.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<CarMoldel> obtener(){
        return carRepository.findAll();
    }

    public void guardar(CarMoldel car){
        carRepository.save(car);
    }
}
