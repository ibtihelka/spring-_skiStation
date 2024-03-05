package com.example.stationski.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@FieldDefaults(level = AccessLevel.PRIVATE) //tous les attribus sont private

public class Abonnement {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numAbon ;
    @OneToOne
    @JoinColumn(name = "skieur_id")
   private skieur skieur1;

    private LocalDate dateDebut;
    private  LocalDate dateFin ;
    private  Float prixAbon ;
    private  TypeAbonnement typeAbon;
}
