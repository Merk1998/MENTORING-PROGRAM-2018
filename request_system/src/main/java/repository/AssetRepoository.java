package repository;

import entity.Test;
import org.springframework.data.repository.CrudRepository;

public class AssetRepoository extends CrudRepository<Test, Long> {
    public Test save(Test test) {
        return null;
    }

    public Iterable<Test> save(Iterable<? extends Test> iterable) {
        return null;
    }

    public Test findOne(Long aLong) {
        return null;
    }

    public boolean exists(Long aLong) {
        return false;
    }

    public Iterable<Test> findAll() {
        return null;
    }

    public long count() {
        return 0;
    }

    public void delete(Long aLong) {

    }

    public void delete(Test test) {

    }

    public void delete(Iterable<? extends Test> iterable) {

    }

    public void deleteAll() {

    }
}