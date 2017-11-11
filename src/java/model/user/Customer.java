/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Activity;

/**
 *
 * @author Do Hung Cuong
 */
public class Customer extends User {

    private List<Activity> activity = new ArrayList<>();
    private String address;
    private Date registered_date;
    private ArrayList<String> dateVisit;

    public Customer() {
    }

    public List<Activity> getActivity() {
        return activity;
    }

    public void setActivity(List<Activity> activity) {
        this.activity = activity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRegistered_date() {
        return registered_date;
    }

    public void setRegistered_date(Date registered_date) {
        this.registered_date = registered_date;
    }

    public ArrayList<String> getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(ArrayList<String> dateVisit) {
        this.dateVisit = dateVisit;
    }

    public Customer(String username, String password, String name, String phone, String address, List<Activity> activity) {
        setUserInfor(username, password, name, phone);
        this.address = address;
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "username=" + username + "\npassword=" + password + "\nphone=" + phone + "\naddress=" + address + "\nregistered_date=" + registered_date + "\ndateVisit=" + dateVisit;
    }
}
