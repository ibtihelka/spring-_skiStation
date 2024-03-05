package com.example.stationski.Repositories;

import com.example.stationski.Entity.Abonnement;
import com.example.stationski.Entity.TypeAbonnement;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface AbonnementRepo extends CrudRepository<Abonnement, Long> {
    //select * from abonnement a where a.type =
    // findByTypeAbon = findBy + l'attribut typeAbon (T en majus)
    //triée en fonction de leur date de début "OrderByDateDebut"
    List<Abonnement> findByTypeAbonOrderByDateDebut (TypeAbonnement typeAbon) ;


    //On souhaite afficher les abonnements qui ont été créés entre deux dates données.
    List<Abonnement> findByDateDebutAfterAndDateFinBefore(LocalDate dateDebut, LocalDate dateFin);

}
