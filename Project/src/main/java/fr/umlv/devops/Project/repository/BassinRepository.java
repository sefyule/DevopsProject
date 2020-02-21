package fr.umlv.devops.Project.repository;

import fr.umlv.devops.Project.model.Bassin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BassinRepository extends CrudRepository<Bassin,Long> {

}
