package fr.umlv.devops.Project.service;

import fr.umlv.devops.Project.model.Bassin;
import fr.umlv.devops.Project.repository.BassinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BassinService {

    private BassinRepository bassinRepository;

    @Autowired
    public BassinService(BassinRepository bassinRepository){
        this.bassinRepository = bassinRepository;
    }

    public Bassin createBassin(Bassin bassin){
        return bassinRepository.save(bassin);
    }

    public Iterable<Bassin> getAll(){
        return  bassinRepository.findAll();
    }

    public Optional<Bassin> getOne(Long id){
        return bassinRepository.findById(id);
    }

    public void deleteBassin (Long id){
        bassinRepository.deleteById(id);
    }

    public Bassin updateBassin(Long id, Bassin bassin){
        bassinRepository.findById(id);
        bassin.setId(id);
        return bassinRepository.save(bassin);
    }






}
