package entity;

@Entity
public class Asset {
    private Long id;
    private String name;
    /**
     * Reference to the type
     */
    private AssetType assetType;
    private Lab lab;

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

    public AssetType getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetType assetType) {
        this.assetType = assetType;
    }

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
    }

    public Asset(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
