package src.models;

public class Hotel {

    private int hotelId;
    private String name;
    private String address;
    private String phone;
    private int touristAttractionId;

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getTouristAttractionId() {
        return touristAttractionId;
    }

    public void setTouristAttractionId(int touristAttractionId) {
        this.touristAttractionId = touristAttractionId;
    }
}
