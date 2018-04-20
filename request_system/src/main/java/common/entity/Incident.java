package common.entity;

//import org.hibernate.annotations.Entity;
//import org.springframework.data.annotation.Id;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="name")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @OneToMany(mappedBy="incident")
    @JsonBackReference
    private List<Request> requests;
    public List<Request> getRequests() {
        return requests;
    }
    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    @Override
    public String toString() {
        return "Incident{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
