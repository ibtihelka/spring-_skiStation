package com.example.stationski.Services;

import com.example.stationski.Entity.Cours;

import java.util.List;

public interface IcoursService  {
    Cours addCour (Cours c);
    Cours updateCours (Cours c);
    List<Cours> getAll ();

    Cours getById (Long id);

    Boolean DeleteById (Long id);

}
