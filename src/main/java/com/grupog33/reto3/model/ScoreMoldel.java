package com.grupog33.reto3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Score")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreMoldel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_score")
    private int idScore;
    private Float value;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_reservation", unique = true, nullable = false)
    private ReservationMoldel reservation;

}
