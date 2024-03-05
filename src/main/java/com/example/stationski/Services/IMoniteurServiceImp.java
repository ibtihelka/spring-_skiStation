package com.example.stationski.Services;

import com.example.stationski.Entity.Cours;
import com.example.stationski.Entity.Moniteur;
import com.example.stationski.Entity.Piste;
import com.example.stationski.Repositories.CourRepo;
import com.example.stationski.Repositories.MoniteurRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class IMoniteurServiceImp implements IMoniteurService{
    private final  MoniteurRepo moniteurRepo;
    private final CourRepo courRepo;

    @Override
    public Moniteur addMoniteur(Moniteur m) {
         return (moniteurRepo.save(m));
    }

    @Override
    public Moniteur updateMoniteur(Moniteur m) {
        return (moniteurRepo.save(m));
    }

    @Override
    public List<Moniteur> getAll() {
        return (List<Moniteur>)moniteurRepo.findAll();
    }


    @Override
    public Moniteur getById(Long id) {
        return moniteurRepo.findById(id).orElse(null);
    }


    @Override
    public boolean DeleteByIdMonit(Long id) {
        moniteurRepo.deleteById(id);
        return (moniteurRepo.existsById(id));
    }

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCours) {
        Cours cours=courRepo.findById( numCours).orElse(null );
        moniteur.setCours((Set<Cours>) cours);//n7otou objet skieur fi inscription
        return moniteurRepo.save(moniteur);

    }

}

