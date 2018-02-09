package tito.example.com.toll_naka.Model;

/**
 * Created by tito on 8/2/18.
 */

public class Tolls {
    private String name,image,lat,lng,cityname;

    public Tolls(String name, String image, String lat, String lng, String cityname) {
        this.name = name;
        this.image = image;
        this.lat = lat;
        this.lng = lng;
        this.cityname = cityname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Tolls() {

    }
}
