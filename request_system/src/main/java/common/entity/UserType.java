package common.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.util.List;

@Entity
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy="userType")
    @JsonBackReference
    private List<User> users;
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserTypeRepository{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
