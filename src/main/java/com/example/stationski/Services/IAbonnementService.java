package com.example.stationski.Services;



import com.example.stationski.Entity.Abonnement;

import java.util.List;

public interface IAbonnementService {
    Abonnement addAbonnement (Abonnement a);
    Abonnement updateAbonnement (Abonnement s);
    List<Abonnement> getAll ();

    Abonnement getById ( Long id);
    Boolean DeleteById ( Long id);
}
