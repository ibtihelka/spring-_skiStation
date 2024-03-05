package com.example.stationski.Services;

import com.example.stationski.Entity.Piste;
import com.example.stationski.Repositories.PisteRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class IPisteServiceImp implements IPisteService {

     private final PisteRepo pisteRepo;



    @Override
    public Piste addpiste(Piste p) {
        return (pisteRepo.save(p));
    }

    @Override
    public Piste updatepiste(Piste p) {
        return (pisteRepo.save(p));
    }

    @Override
    public List<Piste> getAll() {
        log.info("in method");


        return (List<Piste>)pisteRepo.findAll();
    }

    @Override
    public Piste getById(Long id) {
        return pisteRepo.findById(id).orElse(null);
    }

    @Override
    public Boolean DeleteById(Long id) {
        pisteRepo.deleteById(id);

        return (pisteRepo.existsById(id));
    }
}
