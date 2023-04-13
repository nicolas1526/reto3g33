package com.grupog33.reto3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reservation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationMoldel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation")
    private int idReservation;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "devolition_date")
    private Date devolitionDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_car", nullable = false)
    private CarMoldel car;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_client", nullable = false)
    private ClientMoldel client;

}
