package common.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
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

    @ManyToOne(fetch=FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name="user_type_id")
    private UserType userType;
    public UserType getUserType() {
        return userType;
    }
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name="user_group_id")
    private UserGroup userGroup;
    public UserGroup getUserGroup() {
        return userGroup;
    }
    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

    @OneToMany(mappedBy="user")
    @JsonBackReference
    private List<Task> tasks;
    public List<Task> getTasks() {
        return tasks;
    }
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Column (name = "email")
    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
