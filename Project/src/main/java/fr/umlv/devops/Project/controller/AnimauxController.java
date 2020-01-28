package fr.umlv.devops.Project.controller;

import fr.umlv.devops.Project.model.Animaux;
import fr.umlv.devops.Project.service.AnimauxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AnimauxController {

    @Autowired
    private AnimauxService animauxService;

    @GetMapping("/animaux")
    public Iterable<Animaux> getAll() {
        return animauxService.getAll();
    }

    @GetMapping ("/animaux/{id}")
    public Optional<Animaux> getOne (@PathVariable Long id){
        return animauxService.getOne(id);
    }

    @PostMapping("/animaux")
    public Animaux postAnimaux (@RequestBody Animaux animaux){
        return animauxService.createAnimaux(animaux);
    }

    @DeleteMapping ("animaux/{id}")
    public void deleteAnimaux (@PathVariable Long id){
        animauxService.deleteAnimaux(id);
    }

    /*@PostMapping ("animaux/{id}")
    public Animaux updateAnimaux (@PathVariable Long id, @RequestBody Animaux animaux){
        return animauxService.updateAnimaux()
    }*/




}
