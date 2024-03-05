package com.example.stationski.Services;

import com.example.stationski.Entity.Cours;
import com.example.stationski.Entity.skieur;
import com.example.stationski.Entity.Inscription;
import com.example.stationski.Repositories.CourRepo;
import com.example.stationski.Repositories.InscriptionRepo;
import com.example.stationski.Repositories.SkieurRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class IInscriptionServiceImp implements IInscriptionService {
   // @Autowired //ou private final
   private final InscriptionRepo inscriptionRepo;
   private final SkieurRepo skieurRepo;
   private final CourRepo courRepo;
    @Override
    public Inscription addInscription(Inscription i) {
        return inscriptionRepo.save(i);
    }

    @Override
    public Inscription updateInscription(Inscription i) {
        return ( inscriptionRepo.save(i));
    }

    @Override
    public List<Inscription> getAll() {
        return (List<Inscription>)inscriptionRepo.findAll();
    }

    @Override
    public Inscription getById(Long id) {
        return inscriptionRepo.findById(id).orElse(null);
    }

    @Override
    public Boolean DeleteById(Long id) {
        inscriptionRepo.deleteById(id);

        return (inscriptionRepo.existsById(id));
    }
    @Transactional
    @Override
    public Inscription assignRegistrationToCourse(Long numCourse, Long numRegistration) {
        Cours cours= courRepo.findById(numCourse).orElse(null);
        Inscription inscription= inscriptionRepo.findById(numRegistration).orElse(null);
        inscription.setCours(cours);
        return inscription;
    }
    @Override
    public Inscription addRegistrationAndAssignToSkieur(Long numSkieur, Inscription inscription ){
        skieur skieur=skieurRepo.findById(numSkieur).orElse(null );
        inscription.setSkieurs(skieur);//n7otou objet skieur fi inscription
        return inscriptionRepo.save(inscription);
    }


}
