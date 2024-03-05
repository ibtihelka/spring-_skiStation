package com.example.stationski.Controllers;

import com.example.stationski.Entity.Abonnement;
import com.example.stationski.Services.IAbonnementServiceImp;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("abonnement")
@RequiredArgsConstructor
public class AbonnementController {
    private final IAbonnementServiceImp iAbonnementServiceImp;

@GetMapping
public List<Abonnement> getAll(){
    return  iAbonnementServiceImp.getAll();
}

    @GetMapping("{id}")
    public Abonnement getAbonnementbyId(@PathVariable Long id) { //@pathvariable prend la mémé chaîne que le nom de l'attribut voir @GetMapping
        return iAbonnementServiceImp.getById(id);
    }
    @PostMapping
    public Abonnement addAbonnement(@RequestBody Abonnement Abonnement) {// @RequestBody pr les objets et @PathVariable pour les attributs
        return iAbonnementServiceImp.addAbonnement(Abonnement);
    }
    @PutMapping
    public Abonnement updateAbonnement(@RequestBody Abonnement Abonnement) {
        return iAbonnementServiceImp.updateAbonnement(Abonnement);
    }

}
