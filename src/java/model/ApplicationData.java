/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.message.ImpActivityDAO;
import model.user.Administrator;
import DAO.user.ImpAdminDAO;
import java.util.List;

/**
 *
 * @author Do Hung Cuong
 */

public class ApplicationData {

    public static Administrator admin;
    public static List<Activity> newNotifications;
    
    static {
        refreshAll();
    }

    public static void refreshAll() {
        refreshAdmin();
        refreshNotification();
    }

    public static void refreshAdmin() {
        admin = new ImpAdminDAO().getAdminByUserName("cuongvip1295@yahoo.com.vn");
    }

    public static void refreshNotification() {
        newNotifications = new ImpActivityDAO().getNewListNotification();
    }
}
