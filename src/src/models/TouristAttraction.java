package src.models;

public class TouristAttraction {

    private int touristAttractionId;
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTouristAttractionId() {
        return touristAttractionId;
    }

    public void setTouristAttractionId(int touristAttractionId) {
        this.touristAttractionId = touristAttractionId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
