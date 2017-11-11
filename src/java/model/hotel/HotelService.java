/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.hotel;

/**
 *
 * @author Do Hung Cuong
 */
public class HotelService extends HotelItem {

    private String quantity;
    private String note;
    private String serveType;
    private String serveTime;

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getServeType() {
        return serveType;
    }

    public void setServeType(String serveType) {
        this.serveType = serveType;
    }

    public String getServeTime() {
        return serveTime;
    }

    public void initializeServeTime() {
        serveTime = (serveType.equalsIgnoreCase("breakfast")) ? "7:00 am to 10:00 am" : (serveType.equalsIgnoreCase("lunch")) ? serveTime = "11:00 am to 4:00 pm" : (serveType.equalsIgnoreCase("dinner")) ? serveTime = "5:00 pm to 9:00 pm" : (serveType.equalsIgnoreCase("snack")) ? serveTime = "Anytime" : "";
    }

    private boolean isEnoughInfor() {
        return checkNotNull(name, type, details, quantity, note, serveType) && price > 0 && checkNaturalNumber(quantity);
    }

    @Override
    public void initializeSomeInfor() {
        initializeServeTime();
    }

    private boolean isInvalidType() {
        return !type.equals("food") && !type.equals("drink") && !type.equals("fruit") && !type.equals("ice-cream");
    }

    private boolean isInvalidServeType() {
        return !serveType.equals("breakfast") && !serveType.equals("lunch") && !serveType.equals("dinner") && !serveType.equals("snack");
    }

    public String getAbleToEdit() {
        if (!isEnoughInfor()) {
            return "Please input all the information!";
        } else if (isInvalidType()) {
            return "Type must be food, drink, fruit or ice-cream!";
        } else if (isInvalidServeType()) {
            return "Serve type must be breafast, lunch, dinner or snack!";
        }
        return "success";
    }

    public HotelService() {
    }

    public HotelService(String name, String type, double price, String img, String img2, String details, String quantity, String note, String serveType, String serveTime) {
        super.setInfor(name, type, price, img, img2, details);
        this.quantity = quantity;
        this.note = note;
        this.serveType = serveType;
        this.serveTime = serveTime;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nType: " + type + "\nPrice: " + price + "\nImage: " + img + "\nQuantity: " + quantity + "\nDetails: " + details + "\nNote: " + note + "\nServeType: " + serveType + "\nServeTime: " + serveTime;
    }

}
