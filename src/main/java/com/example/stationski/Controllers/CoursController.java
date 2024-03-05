package com.example.stationski.Controllers;

import com.example.stationski.Entity.Cours;
import com.example.stationski.Services.ICourServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cours")
@RequiredArgsConstructor
public class CoursController {
    private final ICourServiceImp iCourServiceImp;
    @GetMapping
    public List<Cours> getAll(){
        return  iCourServiceImp.getAll();
    }

    @GetMapping("{id}")
    public Cours getCourbyId(@PathVariable Long id) { //@pathvariable prend la mémé chaîne que le nom de l'attribut voir @GetMapping
        return iCourServiceImp.getById(id);
    }
    @PostMapping
    public Cours addCour(@RequestBody Cours cours) {// @RequestBody pr les objets et @PathVariable pour les attributs
        return iCourServiceImp.addCour(cours);
    }
    @PutMapping
    public Cours updateCours(@RequestBody Cours cours) {
        return iCourServiceImp.updateCours(cours);
    }

}
