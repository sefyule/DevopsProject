package fr.umlv.devops.Project.controller;

import fr.umlv.devops.Project.model.Bassin;
import fr.umlv.devops.Project.service.BassinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BassinController {

    @Autowired
    private BassinService bassinService;

    @GetMapping("/bassin")
    public Iterable<Bassin> getAll() {
        return bassinService.getAll();
    }

    @PostMapping("/bassin")
    public Bassin postBassin(@RequestBody Bassin bassin) {
        return bassinService.createBassin(bassin);
    }

    @GetMapping("bassin/{id}")
    public Optional<Bassin> getOne(@PathVariable Long id) {
        //@PathVariable {id}
        return bassinService.getOne(id);
    }

    @DeleteMapping("bassin/{id}")
    public void deleteBassin(@PathVariable Long id) {
        bassinService.deleteBassin(id);
    }

    @PostMapping("bassin/{id}")
    public Bassin putBassin(@PathVariable Long id, @RequestBody Bassin bassin) {
        return bassinService.updateBassin(id, bassin);
    }
}
