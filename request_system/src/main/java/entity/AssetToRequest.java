package entity;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class AssetToRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private Asset asset;
    private Request request;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public AssetToRequest(Long id, Asset asset, Request request) {
        this.id = id;
        this.asset = asset;
        this.request = request;
    }

    @Override
    public String toString() {
        return "AssetToRequest{" +
                "id=" + id +
                ", asset=" + asset +
                ", request=" + request +
                '}';
    }
}
