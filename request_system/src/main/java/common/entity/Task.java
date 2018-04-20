package common.entity;

//import org.hibernate.annotations.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
//import org.springframework.data.annotation.Id;


@Entity
public class Task {
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
    @JoinColumn(name="task_type_id")
    private TaskType taskType;
    public TaskType getTaskType() {
        return taskType;
    }
    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name="request_id")
    private Request request;
    public Request getRequest() {
        return request;
    }
    public void setRequest(Request request) {
        this.request = request;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name="user_id")
    private User user;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
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

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", request=" + request +
                ", taskType=" + taskType +
                ", user=" + user +
                ", userGroup=" + userGroup +
                '}';
    }
}
