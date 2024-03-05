package com.example.stationski.Services;

import com.example.stationski.Entity.Abonnement;
import com.example.stationski.Entity.Moniteur;
import com.example.stationski.Repositories.AbonnementRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class IAbonnementServiceImp implements IAbonnementService {

private final AbonnementRepo abonnementRepo;
    @Override
    public Abonnement addAbonnement(Abonnement a) {
        return ( abonnementRepo.save(a));
    }

    @Override
    public Abonnement updateAbonnement(Abonnement a ){
        return ( abonnementRepo.save(a));
    }

    @Override
    public List<Abonnement> getAll() {
        return (List<Abonnement>)abonnementRepo.findAll();
    }

    @Override
    public Abonnement getById(Long id) {
        return abonnementRepo.findById(id).orElse(null);
    }

    @Override
    public Boolean DeleteById(Long id) {

        abonnementRepo.deleteById(id);

        return (abonnementRepo.existsById(id));
    }
}

