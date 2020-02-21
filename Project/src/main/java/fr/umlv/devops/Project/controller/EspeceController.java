package fr.umlv.devops.Project.controller;

import fr.umlv.devops.Project.model.Espece;
import fr.umlv.devops.Project.service.EspeceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EspeceController {

    @Autowired
    private EspeceService especeService;

    @GetMapping("/espece")
    public Iterable<Espece> getAll() {
        return especeService.getAll();
    }

    @PostMapping("/espece")
    public Espece postEspece(@RequestBody Espece espece) {
        return especeService.createEspece(espece);
    }

    @GetMapping("espece/{id}")
    public Optional<Espece> getOne(@PathVariable Long id) {
        return especeService.getOne(id);
    }

    @DeleteMapping("espece/{id}")
    public void deleteEspece(@PathVariable Long id) {
        especeService.deleteEspece(id);
    }

    @PostMapping("espece/{id}")
    public Espece putPersonne(@PathVariable Long id, @RequestBody Espece espece) {
        return especeService.updateEspece(id, espece);
    }


}
