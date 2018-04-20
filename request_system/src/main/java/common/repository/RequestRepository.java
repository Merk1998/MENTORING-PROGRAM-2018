package common.repository;

import common.entity.Request;
import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<Request, Long> {

}