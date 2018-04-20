package common.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;

@Entity
public class AssetToRequest {
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

    @ManyToOne(fetch=FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name="asset_id")
    private Asset asset;
    public Asset getAsset() {
        return asset;
    }
    public void setAsset(Asset asset) {
        this.asset = asset;
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

    @Override
    public String toString() {
        return "AssetToRequest{" +
                "id=" + id +
                ", asset=" + asset +
                ", request=" + request +
                '}';
    }
}
