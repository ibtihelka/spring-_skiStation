package com.example.stationski.Services;
import com.example.stationski.Entity.TypeAbonnement;
import com.example.stationski.Entity.skieur;

import java.util.List;

public interface IskieurService {
   skieur addskieur (skieur s);
    skieur updateskieur (skieur s);
    List<skieur> getAll ();

    skieur getById ( Long id);
    Boolean DeleteById ( Long id);

    skieur addSkierAndAssignToCourse(skieur skieur, Long numCourse) ;
   List<skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);

    skieur assignSkierToPiste(Long numSkieur, Long numPiste);




}
