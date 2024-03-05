package com.example.stationski.Services;
import com.example.stationski.Entity.*;
import com.example.stationski.Repositories.CourRepo;
import com.example.stationski.Repositories.InscriptionRepo;
import com.example.stationski.Repositories.PisteRepo;
import com.example.stationski.Repositories.SkieurRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor

public class ISkieurServiceImp implements IskieurService {

     private final SkieurRepo skieurRepo ;
    private final InscriptionRepo inscriptionRepo;
    private final  CourRepo courRepo;
    private  final PisteRepo pisteRepo;


    @Override
    public skieur addskieur (skieur s) {
        return ( skieurRepo.save(s));
    }

    @Override
    public skieur updateskieur(skieur s) {
        return ( skieurRepo.save(s));
    }

    @Override
    public List<skieur> getAll() {
        return (List<skieur>)skieurRepo.findAll();
    }

    @Override
    public skieur getById(Long id) {
        return skieurRepo.findById(id).orElse(null);
    }

    @Override
    public Boolean DeleteById(Long id) {
        skieurRepo.deleteById(id);
        return !(skieurRepo.existsById(id));
    }

    @Override
    public skieur addSkierAndAssignToCourse(skieur skieur, Long numCourse) {
        // récupération des objets
        Cours cours = courRepo.findById(numCourse).orElse(null);
        Inscription inscription= skieur.getInscriptions().stream().findFirst().get();
        //
        inscription.setSkieurs(skieur);
        inscription.setCours(cours);

        skieurRepo.save(skieur);
        inscriptionRepo.save(inscription);



        return skieur ;
    }

    @Override
    public List<skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return skieurRepo.findByAbonnementTypeAbon(typeAbonnement);

    }

    @Transactional
    @Override
    public skieur assignSkierToPiste(Long numSkieur, Long numPiste){
        Piste piste = pisteRepo.findById(numSkieur).orElse(null);
        skieur skieur = skieurRepo.findById(numPiste).orElse(null);
        skieur.setPistes((Set<Piste>) piste);
        return skieur;
    }



}
