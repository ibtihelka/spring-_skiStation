package com.example.stationski.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //tous les attribus sont private

public class Cours {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;

    @OneToMany(mappedBy = "cours")
    Set<Inscription> inscriptions;

    private int niveau;
    private TypeCours typeCours;
    private Support support;
    private Float prix;
    private  int creneau ;
    //Set <Inscription> inscriptions;
}

