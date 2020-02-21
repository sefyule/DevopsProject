package fr.umlv.devops.Project.controller;

import fr.umlv.devops.Project.model.Secteur;
import fr.umlv.devops.Project.service.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SecteurController {

    @Autowired
    private SecteurService secteurService;

    @GetMapping("/secteur")
    public Iterable<Secteur> getAll() {
        return secteurService.getAll();
    }

    @PostMapping("/secteur")
    public Secteur postSecteur(@RequestBody Secteur secteur) {
        return secteurService.createSecteur(secteur);
    }

    @GetMapping("secteur/{id}")
    public Optional<Secteur> getOne(@PathVariable Long id) {
        return secteurService.getOne(id);
    }

    @DeleteMapping("secteur/{id}")
    public void deleteSecteur(@PathVariable Long id) {
        secteurService.deleteSecteur(id);
    }

    @PostMapping("secteur/{id}")
    public Secteur putSecteur(@PathVariable Long id, @RequestBody Secteur secteur) {
        return secteurService.updateSecteur(id, secteur);
    }
}
