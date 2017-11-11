/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.hotel;

import DAO.user.ImpCustomerDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import service.application.CalculatorService;

/**
 *
 * @author Do Hung Cuong
 */
public class HotelRoom extends HotelItem {

    private String size;
    private String numpeople;
    private String status;
    private String amenities;
    private String booked_by;
    private String avgAminities; 
    private String checkin;
    private String checkout;
    private int star;
    private int numvote;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNumpeople() {
        return numpeople;
    }

    public void setNumpeople(String numpeople) {
        this.numpeople = numpeople;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public String getBooked_by() {
        return booked_by;
    }

    public void setBooked_by(String booked_by) {
        this.booked_by = booked_by;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getNumvote() {
        return numvote;
    }

    public void setNumvote(int numvote) {
        this.numvote = numvote;
    }

    public String getAvgAminities() {
        return avgAminities;
    }

    public void setAvgAminities(String avgAminities) {
        this.avgAminities = avgAminities;
    }

    @Override
    public void initializeSomeInfor() {
        if (status.equals("available")) {
            this.booked_by = "";
            this.checkin = "";
            this.checkout = "";
        }
    }

    private boolean isInvalidType() {
        return !type.equals("deluxe") && !type.equals("family") && !type.equals("couple") && !type.equals("single");
    }

    private boolean isInvalidStatus() {
        return !status.equals("available") && !status.equals("booked");
    }

    private boolean isBookedbyCorrect() {
        if (status.equals("booked")) {
            if (!checkNotNull(booked_by, checkin, checkout)) {
                return false;
            } else if (!new ImpCustomerDAO().checkexsitCustomer(booked_by)) {
                return false;
            }
        }
        return true;
    }

    private boolean isEnoughInfor() {
        return checkNotNull(name, type, size, price, status, details, numpeople, amenities, avgAminities);
    }
    
    private boolean isNumberFormat() {
        return checkNaturalNumber(size, numpeople, avgAminities) && price > 0;
    }

    public boolean isvalidDate() {
        if (status.equals("available")) {
            return true;
        }
        System.out.println(checkin);
        System.out.println(checkout);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date today = CalculatorService.formatDateTime(format.format(new Date()));
        Date checkindate = CalculatorService.formatDateTime(checkin);
        Date checkoutdate = CalculatorService.formatDateTime(checkout);
        return today.compareTo(checkindate) <= 0 && checkindate.compareTo(checkoutdate) <= 0;
    }

    public String getAbleToEdit() {
        if (!isEnoughInfor()) {
            return "Please input all the information!";
        } else if(!isNumberFormat()) {
            return "Price, Size, Star and Number of Adults must be a positive natural number!";
        } else if (isInvalidType()) {
            return "Type must be deluxe, family, couple or single!";
        } else if (isInvalidStatus()) {
            return "Status must be available or booked!";
        } else if (!isvalidDate()) {
            return "The checkin date and checkout date is not accepted!";
        }
        return "success";
    }

    public boolean allInforCorrect() {
        return isEnoughInfor() && !isInvalidType() && !isInvalidStatus() && isvalidDate() && isNumberFormat();
    }

    public HotelRoom() {
    }

    public HotelRoom(String name, String size, double price, String numpeople, String img, String img2, String type, String details, String amenities) {
        super.setInfor(name, type, price, img, img2, details);
        this.size = size;
        this.numpeople = numpeople;
        this.amenities = amenities;
        this.status = "available";
    }

    public HotelRoom(String name, String size, double price, String numpeople, String status, String img, String img2, String type, String details, String amenities, String booked_by, String checkin, String checkout) {
        super.setInfor(name, type, price, img, img2, details);
        this.size = size;
        this.numpeople = numpeople;
        this.status = status;
        this.amenities = amenities;
        this.booked_by = booked_by;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + star + "★" + "\nnum vote: " + numvote + "\nType: " + type + "\nPrice: " + price + "\nImage: " + img + "\nSize: " + size
                + "\nNumber of people: " + numpeople + "\nStatus: " + status + "\nAmenities: " + amenities + "\nBooked by: " + booked_by + "\nCheck in: " + checkin + "\nCheck out: " + checkout;
    }

}
