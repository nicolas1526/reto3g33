package com.grupog33.reto3.repository;

import com.grupog33.reto3.model.AdminMoldel;
import com.grupog33.reto3.model.CarMoldel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarMoldel,Integer> {
}
