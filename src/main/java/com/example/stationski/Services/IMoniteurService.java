package com.example.stationski.Services;

import com.example.stationski.Entity.Moniteur;

import java.util.List;

public interface IMoniteurService {
    Moniteur addMoniteur (Moniteur m);
    Moniteur updateMoniteur (Moniteur m);
    List<Moniteur> getAll ( );
    Moniteur getById (Long id);
    boolean DeleteByIdMonit (Long id);
    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long  numCours);

}
