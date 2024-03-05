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

public class Piste {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    @ManyToMany
    Set<skieur> skieurs;


    private  String nomPiste;
    private  int longeur;
    private  int pente;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;


}
