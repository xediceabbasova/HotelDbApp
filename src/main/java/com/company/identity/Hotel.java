package com.company.identity;

import java.sql.Date;

public class Hotel {

    private int id;
    private String customerName;
    private String customerSurname;
    private String identityId;
    private Date dateIn;
    private Date dateOut;
    private double price;
    private int roomId;

    public Hotel() {
    }

    public Hotel(int id) {
        this.id = id;
    }

    public Hotel(int id, String customerName, String customerSurname, String identityId, Date dateIn, Date dateOut, double price, int roomId) {
        this.id = id;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.identityId = identityId;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.price = price;
        this.roomId = roomId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "Hotel{" + "id=" + id + ", customerName=" + customerName + ", customerSurname=" + customerSurname + ", identityId=" + identityId + ", dateIn=" + dateIn + ", dateOut=" + dateOut + ", price=" + price + ", roomId=" + roomId + '}';
    }

}
