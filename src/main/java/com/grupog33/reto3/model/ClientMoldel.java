package com.grupog33.reto3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientMoldel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private int idClient;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String password;
    @Column(length = 3)
    private byte age;
    @Column(length = 250)
    private String name;

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "client")
    private List<MessageMoldel> messages;

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "client")
    private List<ReservationMoldel> reservations;
}
