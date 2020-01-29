package fr.umlv.devops.Project.repository;

import fr.umlv.devops.Project.model.Espece;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EspeceRepository extends CrudRepository<Espece,Long> {

}
