package common.repository;

import common.entity.Incident;
import org.springframework.data.repository.CrudRepository;

public interface IncidentRepository extends CrudRepository<Incident, Long> {

}