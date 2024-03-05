package com.example.stationski.Controllers;

import com.example.stationski.Entity.TypeAbonnement;
import com.example.stationski.Entity.skieur;
import com.example.stationski.Services.ISkieurServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("skieur")
@RequiredArgsConstructor
public class SkieurController {
    private final ISkieurServiceImp iSkieurServiceImp;

    @GetMapping
    public List<skieur> getAll() {
        return iSkieurServiceImp.getAll();
    }

    @GetMapping("{id}")
    public skieur getById(@PathVariable Long id){
        return iSkieurServiceImp.getById(id);
    }

    @PutMapping
    public skieur updateskieur(skieur s) {
        return iSkieurServiceImp.updateskieur(s);
    }

    @PostMapping
    public skieur addskieur(@RequestBody skieur s) {
        return iSkieurServiceImp.addskieur(s);
    }
    @PostMapping("{numCours}")
    public skieur addSkierAndAssignToCourse(skieur skieur, Long numCours){
        return iSkieurServiceImp.addSkierAndAssignToCourse(skieur, numCours);
    }
    @GetMapping("/skieurs")
    public List<skieur> retrieveSkiersBySubscriptionType(@RequestParam TypeAbonnement typeAbonnement) {
        return iSkieurServiceImp.retrieveSkiersBySubscriptionType(typeAbonnement);
    }

}
