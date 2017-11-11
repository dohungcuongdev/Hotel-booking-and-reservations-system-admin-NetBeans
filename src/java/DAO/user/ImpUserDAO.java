/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.user;

import com.google.gson.Gson;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import connectMongoDB.MongoDBConnector;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ChartData;
import model.user.FollowUsers;
import service.application.CalculatorService;

/**
 *
 * @author HUNGCUONG
 */
public class ImpUserDAO implements DAOUser {

    Gson gson = new Gson();
    DBCollection collection;

    {
        try {
            collection = MongoDBConnector.createConnection("follow-users");
        } catch (UnknownHostException ex) {
            Logger.getLogger(ImpAdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private ArrayList<FollowUsers> fixFollowUsers(ArrayList<FollowUsers> listFollowUsers) {
        int size = listFollowUsers.size();
        for (int i = 0; i < size; i++) {
            FollowUsers fu = listFollowUsers.get(i);
            if (i == size - 1) {
                fu.setDuration(0);
                fu.setDurationTime(CalculatorService.formatMillisecond(0));
            } else {
                int duration = listFollowUsers.get(i + 1).getDuration();
                fu.setDuration(duration);
                fu.setDurationTime(CalculatorService.formatMillisecond(duration));
            }
            listFollowUsers.set(i, fu);
        }
        return listFollowUsers;
    }

    @Override
    public ArrayList<FollowUsers> getListFollowUsers() {
        ArrayList<FollowUsers> listFollowUsers = new ArrayList<>();
        DBCursor cursor = collection.find();
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            FollowUsers followUsers = gson.fromJson(obj + "", FollowUsers.class);
            followUsers.setId(obj.get("_id") + "");
            followUsers.setDate_access(CalculatorService.getDateTime(obj.get("created_at") + ""));
            listFollowUsers.add(followUsers);
        }
        return fixFollowUsers(listFollowUsers);
    }

    @Override
    public Map getFollowUsersMap(ArrayList<FollowUsers> list) {
        Map m = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i).getPage_access();
            if (m.containsKey(key)) {
                m.replace(key, Integer.parseInt(m.get(key) + "") + 1);
            } else {
                m.put(key, 1);
            }
        }
        return m;
    }

    @Override
    public Map getFollowUsersMapByIP(ArrayList<FollowUsers> list) {
        Map m = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i).getUser_ip_address();
            if (m.containsKey(key)) {
                m.replace(key, Integer.parseInt(m.get(key) + "") + 1);
            } else {
                m.put(key, 1);
            }
        }
        return m;
    }

    @Override
    public Map getMapFollowUsersCountry(ArrayList<FollowUsers> list) {
        Map m = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i).getCountry();
            if (m.containsKey(key)) {
                m.replace(key, Integer.parseInt(m.get(key) + "") + 1);
            } else {
                m.put(key, 1);
            }
        }
        return m;
    }
    
    private int getTotalChartData(ArrayList<FollowUsers> list) {
        int result = 0;
        Map m = getMapFollowUsersCountry(list);
        for (Object key : m.keySet()) {
            result += Integer.parseInt(m.get(key) + "");
        }
        return result;
    }
    
    @Override
    public List<ChartData> getListFollowUsersChartData(ArrayList<FollowUsers> list) {
        List<ChartData> l = new ArrayList();
        int totalChartData = getTotalChartData(list);
        Map m = getMapFollowUsersCountry(list);
        for (Object key : m.keySet()) {
            int quantity = Integer.parseInt(m.get(key) + "");
            l.add(new ChartData(key + "", quantity , CalculatorService.round(quantity*100.0/totalChartData, 2)));
        }
        return l;
    }

    @Override
    public String getFollowUsersCountry(ArrayList<FollowUsers> list) {
        StringBuilder jsonArray = new StringBuilder("[");
        Map m = getMapFollowUsersCountry(list);
        m.keySet().stream().forEach((key) -> {
            Object value = m.get(key);
            jsonArray.append("{\"country\" : \"" + key + "\", \"visits\" : " + value + "},");
        });
        return jsonArray.append("]").toString();
    }

    @Override
    public Map getFollowUsersMapByOneIP(ArrayList<FollowUsers> list, String ip) {
        Map m = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUser_ip_address().equals(ip)) {
                String key = list.get(i).getPage_access();
                if (m.containsKey(key)) {
                    m.replace(key, Integer.parseInt(m.get(key) + "") + 1);
                } else {
                    m.put(key, 1);
                }
            }
        }
        return m;
    }
}
