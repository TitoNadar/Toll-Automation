package tito.example.com.toll_naka;

/**
 * Created by tito on 22/2/18.
 */

public class Toll {
    private String name;
    private String img;
    private String address;
    private String lat;
    private String lng;

    public Toll(String name, String img, String address, String lat, String lng) {
        this.name = name;
        this.img = img;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
    }

    public Toll() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}