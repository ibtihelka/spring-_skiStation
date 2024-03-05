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

public class Inscription {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long numInscription ;
    private int numSemaine ;

    @ManyToOne
    Cours cours;

    @ManyToOne
    skieur skieurs;




}
