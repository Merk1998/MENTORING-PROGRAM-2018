package common.entity;

//import org.hibernate.annotations.Entity;
import javax.persistence.*;
//import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(unique = true)
    private String name;


    //@ManyToOne(fetch=FetchType.LAZY)
    //@JoinColumn(name="asset_type_id")
    //private AssetType assetType;
    //private Lab lab;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   // public AssetType getAssetType() {
     //   return assetType;
    //}

   // public void setAssetType(AssetType assetType) {
   /*     this.assetType = assetType;
    }

    @OneToMany("lab_id")
    public Lab getLab() {
        return lab;
    }

    public void setLab(Lab lab) {
        this.lab = lab;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", assetType=" + assetType +
                ", lab=" + lab +
                '}';
    }*/


}
