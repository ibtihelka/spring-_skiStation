package com.example.stationski.Services;

import com.example.stationski.Entity.Inscription;

import java.util.List;

public interface IInscriptionService {
    Inscription addInscription(Inscription i);
    Inscription updateInscription(Inscription i);
    List<Inscription> getAll ();

    Inscription getById ( Long id);
    Boolean DeleteById ( Long id);
   //Inscription assignRegistrationToCourse(Long numCourse, Long numRegistration);
    Inscription addRegistrationAndAssignToSkieur(Long numSkieur, Inscription inscription );
    Inscription assignRegistrationToCourse(Long id, Long numRegistration );


}
