/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.message;

import java.util.List;
import model.Activity;
import model.user.Administrator;

/**
 *
 * @author Do Hung Cuong
 */
public interface DAOActivity {

    public List<Activity> getAllActivity();

    public List<Activity> getAllActivityByUserName(String username);

    public List<Activity> getNewListNotification();

    public Activity getActivityBy(String id);
    
    public void seenNotification(String id);
}
