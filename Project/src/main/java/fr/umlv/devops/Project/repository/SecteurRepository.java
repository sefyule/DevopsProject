package fr.umlv.devops.Project.repository;

import fr.umlv.devops.Project.model.Secteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecteurRepository extends CrudRepository<Secteur,Long> {

}
