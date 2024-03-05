package com.example.stationski.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //tous les attribus sont private

public class Moniteur {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long numMoniteur;
    @OneToMany
    Set <Cours> cours;


    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;
}
