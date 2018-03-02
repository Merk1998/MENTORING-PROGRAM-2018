package entity;

public class AssetToRequest {
    private int id;
    private Asset asset;
    private Request request;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public AssetToRequest(int id, Asset asset, Request request) {
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
