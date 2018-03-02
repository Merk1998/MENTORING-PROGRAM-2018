package entity;

@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private boolean dummy;

    private int tries;

}

package com.test.repository;

        import org.springframework.data.repository.CrudRepository;
        import com.test.entity.Test;

public interface TestRepository extends CrudRepository<Test, Long> {}