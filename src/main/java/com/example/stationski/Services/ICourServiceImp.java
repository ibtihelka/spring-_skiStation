package com.example.stationski.Services;

import com.example.stationski.Entity.Cours;
import com.example.stationski.Repositories.CourRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ICourServiceImp implements IcoursService {

    private final CourRepo courRep ;

    @Override
    public Cours addCour(Cours c) {
        return courRep.save(c);
    }

    @Override
    public Cours updateCours(Cours c) {
        return courRep.save(c);
    }

    @Override
    public List<Cours> getAll() {
        return (List<Cours>)courRep.findAll();
    }

    @Override
    public Cours getById(Long id) {
        return courRep.findById(id).orElse( null);
       // return  courRep.findById(id).orElseThrow(() -> new IllegalArgumentException("no cours found ")
    }



    @Override
    public Boolean DeleteById(Long id) {
         courRep.deleteById(id);
        return !(courRep.existsById(id));
    }
}
