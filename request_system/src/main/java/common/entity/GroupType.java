package common.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.util.List;


@Entity
public class GroupType {
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

    @Column(name="name")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy="groupType")
    @JsonBackReference
    private List<UserGroup> usersGroups;
    public List<UserGroup> getUsersGroups() {
        return usersGroups;
    }
    public void setUsersGroups(List<UserGroup> usersGroups) {
        this.usersGroups = usersGroups;
    }

    @Override
    public String toString() {
        return "GroupTypeController{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
