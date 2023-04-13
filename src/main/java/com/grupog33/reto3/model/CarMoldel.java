package com.grupog33.reto3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Car")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarMoldel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_car")
    private int idCar;
    @Column(length = 45)
    private String name;
    @Column(length = 45)
    private String brand;
    @Column(length = 4)
    private int year;
    @Column(length = 250)
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_gama", nullable = false)
    private GamaMoldel gama;

}
