package fr.umlv.devops.Project.service;

import fr.umlv.devops.Project.model.Animaux;
import fr.umlv.devops.Project.repository.AnimauxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnimauxService {

    @Autowired
    private AnimauxRepository animauxRepository;

    public AnimauxService (AnimauxRepository animauxRepository){
        this.animauxRepository = animauxRepository;
    }


    public Iterable<Animaux> getAll(){
        return animauxRepository.findAll();
    }

    public Optional<Animaux> getOne (Long id){
        return animauxRepository.findById(id);
    }

    public Animaux createAnimaux (Animaux animaux){
        return animauxRepository.save(animaux);
    }

    public void deleteAnimaux (Long id){
        animauxRepository.deleteById(id);
    }

   /* public Animaux updateAnimaux (Long id){
        TODO : Update
    }*/


}
