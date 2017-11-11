/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import DAO.hotel.ImpRoomDAO;
import DAO.user.DAOUser;
import DAO.user.ImpUserDAO;
import java.util.List;
import model.hotel.HotelRoom;
import model.user.FollowUsers;

/**
 *
 * @author Do Hung Cuong
 */
public class Test {

    public static void main(String args[]) {
        ImpRoomDAO d = new ImpRoomDAO();

        List<HotelRoom> l = d.getAllRooms();
        System.out.println(l);
        

    }

}
