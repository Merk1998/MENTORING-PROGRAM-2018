package repository;

import entity.Asset;
import org.springframework.data.repository.CrudRepository;

public interface AssetRepository extends CrudRepository<Asset, Long> {

}