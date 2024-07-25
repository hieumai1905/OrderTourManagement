package src.models;

import java.sql.Date;

public class BookHotel {

    private int bookHotelId;
    private Date bookingDate;
    private Date arrivalDate;
    private Date departureDate;
    private int cost;
    private int hotelId;
    private int tourId;

    public int getBookHotelId() {
        return bookHotelId;
    }

    public void setBookHotelId(int bookHotelId) {
        this.bookHotelId = bookHotelId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }
}
