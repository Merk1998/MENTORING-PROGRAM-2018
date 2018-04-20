package common.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.List;

@Entity
public class UserGroup {
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
    @JoinColumn(name="group_type_id")
    private GroupType groupType;
    public GroupType getGroupType() {
        return groupType;
    }
    public void setGroupType(GroupType groupType) {
        this.groupType = groupType;
    }

    @OneToMany(mappedBy="userGroup")
    @JsonBackReference
    private List<Task> tasks;
    public List<Task> getTasks() {
        return tasks;
    }
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @OneToMany(mappedBy="userGroup")
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
        return "UserGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", groupType=" + groupType +
                '}';
    }
}
