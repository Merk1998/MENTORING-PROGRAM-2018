package common.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.List;

@Entity
public class Request {
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


    @ManyToOne(fetch=FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name="incident_id")
    private Incident incident;
    public Incident getIncident() {
        return incident;
    }
    public void setIncident(Incident incident) {
        this.incident = incident;
    }

    @OneToMany(mappedBy="request")
    @JsonBackReference
    private List<AssetToRequest> assetsToRequest;
    public List<AssetToRequest> getAssetsToRequest() {
        return assetsToRequest;
    }
    public void setAssetsToRequest(List<AssetToRequest> assetsToRequest) {
        this.assetsToRequest = assetsToRequest;
    }

    @OneToMany(mappedBy="request")
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
        return "Request{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", incident=" + incident +
                '}';
    }
}
