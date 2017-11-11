/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.ChartData;
import model.user.FollowUsers;

/**
 *
 * @author Do Hung Cuong
 */
public interface DAOUser {
    public ArrayList<FollowUsers> getListFollowUsers();
    
    public Map getFollowUsersMap(ArrayList<FollowUsers> list);
    
    public Map getFollowUsersMapByIP(ArrayList<FollowUsers> list);
    
    public Map getFollowUsersMapByOneIP(ArrayList<FollowUsers> list, String ip);
    
    public Map getMapFollowUsersCountry(ArrayList<FollowUsers> list);
    
    public String getFollowUsersCountry(ArrayList<FollowUsers> list);
    
    public List<ChartData> getListFollowUsersChartData(ArrayList<FollowUsers> list);
}
