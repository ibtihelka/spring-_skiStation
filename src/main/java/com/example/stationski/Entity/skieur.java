package com.example.stationski.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class skieur {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long numSkieur;
    @ManyToMany(mappedBy = "skieurs")
    Set<Piste> pistes;

    @OneToMany(mappedBy = "skieurs")
    Set<Inscription> inscriptions;

    @OneToOne(cascade = CascadeType.ALL)
    private Abonnement abonnement;

    private String nomS;

    private String prenomS;
    private LocalDate dateNaissance;

    private  String ville;
}
