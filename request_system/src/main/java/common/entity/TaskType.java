package common.entity;

//import org.hibernate.annotations.Entity;
//import org.springframework.data.annotation.Id;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class TaskType {
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

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy="taskType")
    @JsonBackReference
    private List<Task> tasks;
    public List<Task> getTasks() {
        return tasks;
    }
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "TaskType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
