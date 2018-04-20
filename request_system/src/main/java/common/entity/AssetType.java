package common.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.util.List;


@Entity
public class AssetType {
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

    @OneToMany(mappedBy="assetType")
    @JsonBackReference
    private List<Asset> assets;
    public List<Asset> getAssets() {
        return assets;
    }
    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    @Override
    public String toString() {
        return "AssetType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
