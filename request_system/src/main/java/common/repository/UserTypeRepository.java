package common.repository;

import common.entity.UserType;
import org.springframework.data.repository.CrudRepository;

public interface UserTypeRepository extends CrudRepository <UserType, Long> {

}