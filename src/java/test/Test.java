/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import daos.impl.RoomDAOImpl;
import daos.impl.UserDAOImpl;
import java.util.List;
import model.hotel.HotelRoom;
import model.user.tracking.FollowUsers;
import daos.UserDAO;

/**
 *
 * @author Do Hung Cuong
 */
public class Test {

    public static void main(String args[]) {
        RoomDAOImpl d = new RoomDAOImpl();

        List<HotelRoom> l = d.getAllRooms();
        System.out.println(l);
        

    }

}
