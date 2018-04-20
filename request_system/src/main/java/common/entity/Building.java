package common.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.util.List;


@Entity
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    @Column(name="name")
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @OneToMany(mappedBy="building")
    @JsonBackReference
    private List<Lab> labs;
    public List<Lab> getLabs() {
        return labs;
    }
    public void setLabs(List<Lab> labs) {
        this.labs = labs;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
