package common.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Asset {
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

    @NotNull
    @Column(unique = true)
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name="lab_id")
    private Lab lab;
    public Lab getLab() {
        return lab;
    }
    public void setLab(Lab lab) {
        this.lab = lab;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name="asset_type_id")
    private AssetType assetType;
    public AssetType getAssetType() {
        return assetType;
    }
    public void setAssetType(AssetType assetType) {
        this.assetType = assetType;
    }

    @OneToMany(mappedBy="asset")
    @JsonBackReference
    private List<AssetToRequest> assetsToRequests;
    public List<AssetToRequest> getAssetsToRequests() {
        return assetsToRequests;
    }
    public void setAssetsToRequests(List<AssetToRequest> assetsToRequests) {
        this.assetsToRequests = assetsToRequests;
    }







/*
    @Override
    public String toString() {
        return "Asset{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", assetType=" + assetType +
                ", lab=" + lab +
                '}';
    }
*/

}
