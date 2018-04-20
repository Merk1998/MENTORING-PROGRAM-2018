package common.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.List;

@Entity
public class Lab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    @Column(name="name")
    private  String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @OneToMany(mappedBy="lab")
    @JsonBackReference
    private List<Asset> assets;
    public List<Asset> getAssets() {
        return assets;
    }
    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name="building_id")
    private Building building;
    public Building getBuilding() {
        return building;
    }
    public void setBuilding(Building building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", building=" + building +
                '}';
    }

}
