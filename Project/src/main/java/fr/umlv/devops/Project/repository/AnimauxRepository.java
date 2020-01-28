package fr.umlv.devops.Project.repository;

import fr.umlv.devops.Project.model.Animaux;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimauxRepository extends CrudRepository<Animaux,Long> {

}
