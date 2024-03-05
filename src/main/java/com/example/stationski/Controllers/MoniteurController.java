package com.example.stationski.Controllers;

import com.example.stationski.Entity.Abonnement;
import com.example.stationski.Entity.Moniteur;
import com.example.stationski.Services.IMoniteurServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("moniteurs")
@RequiredArgsConstructor
public class MoniteurController {
    private  final IMoniteurServiceImp iMoniteurServiceImp;

    @GetMapping
    public List<Moniteur> getAll(){
        return  iMoniteurServiceImp.getAll();
    }

    @GetMapping("{id}")
    public Moniteur getAbonnementbyId(@PathVariable Long id) { //@pathvariable prend la mémé chaîne que le nom de l'attribut voir @GetMapping
        return iMoniteurServiceImp.getById(id);
    }
    @PostMapping
    public Moniteur addMoniteur(@RequestBody Moniteur Moniteur) {// @RequestBody pr les objets et @PathVariable pour les attributs
        return iMoniteurServiceImp.addMoniteur(Moniteur);
    }
    @PutMapping
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur) {
        return iMoniteurServiceImp.updateMoniteur(moniteur
        );
    }
    @PostMapping("{numCours}")
    public Moniteur addInstructorAndAssignToCourse(@RequestBody Moniteur moniteur, @PathVariable Long  numCours){
        return iMoniteurServiceImp.addInstructorAndAssignToCourse(moniteur, numCours);
    }


}
