package fr.umlv.devops.Project.service;

import fr.umlv.devops.Project.model.Secteur;
import fr.umlv.devops.Project.repository.SecteurRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SecteurService {

    private SecteurRepository secteurRepository;

    public SecteurService (SecteurRepository secteurRepository){
        this.secteurRepository = secteurRepository;
    }

    public Secteur createSecteur (Secteur secteur){
        return  secteurRepository.save(secteur);
    }

    public void deleteSecteur (Long id){
        secteurRepository.deleteById(id);
    }

    public Iterable<Secteur> getAll(){
        return secteurRepository.findAll();
    }

    public Optional<Secteur> getOne(Long id){
        return secteurRepository.findById(id);
    }

    public  Secteur updateSecteur (Long id, Secteur secteur){
        secteurRepository.findById(id);
        secteur.setId(id);
        return secteurRepository.save(secteur);
    }
}
