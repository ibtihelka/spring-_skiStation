package com.example.stationski.Controllers;

import com.example.stationski.Entity.Abonnement;
import com.example.stationski.Entity.Inscription;
import com.example.stationski.Services.IAbonnementServiceImp;
import com.example.stationski.Services.IInscriptionService;
import com.example.stationski.Services.IInscriptionServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("inscriptions")
@RequiredArgsConstructor
public class inscriptionController {
    private final IInscriptionServiceImp iInscriptionServiceImp;

    @GetMapping
    public List<Inscription> getAll(){
        return  iInscriptionServiceImp.getAll();
    }

    @GetMapping("{id}")
    public Inscription getAbonnementbyId(@PathVariable Long id) { //@pathvariable prend la mémé chaîne que le nom de l'attribut voir @GetMapping
        return iInscriptionServiceImp.getById(id);
    }
    @PostMapping
    public Inscription addInscription(@RequestBody Inscription inscription) {// @RequestBody pr les objets et @PathVariable pour les attributs
        return iInscriptionServiceImp.addInscription(inscription);
    }
    @PutMapping
    public Inscription updateInscription(@RequestBody Inscription inscription) {
        return iInscriptionServiceImp.updateInscription(inscription);
    }

    @PostMapping("{numSkieur}")
    public Inscription addRegistrationAndAssignToSkieur(@PathVariable Long numSkieur, @RequestBody Inscription inscription ){
        return iInscriptionServiceImp.addRegistrationAndAssignToSkieur(numSkieur, inscription);
    }
    @PutMapping("{id}/{numRegistration}")
    public Inscription assignRegistrationToCourse (@PathVariable Long id, @PathVariable Long numRegistration){
        return iInscriptionServiceImp.assignRegistrationToCourse(id,numRegistration);
    }

}
