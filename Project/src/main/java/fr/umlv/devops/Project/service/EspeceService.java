package fr.umlv.devops.Project.service;


import fr.umlv.devops.Project.model.Espece;
import fr.umlv.devops.Project.repository.EspeceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EspeceService {

    private EspeceRepository especeRepository;

    @Autowired
    public EspeceService (EspeceRepository especeRepository){
        this.especeRepository = especeRepository;
    }

    public Espece createEspece (Espece espece){
        return especeRepository.save(espece);
    }

    public void deleteEspece(Long id){
        especeRepository.deleteById(id);
    }

    public Iterable<Espece> getAll(){
        return  especeRepository.findAll();
    }

    public Optional<Espece> getOne(Long id){
        return especeRepository.findById(id);
    }

    public Espece updateEspece (Long id, Espece espece){
        especeRepository.findById(id);
        espece.setId(id);
        return especeRepository.save(espece);
    }

}
