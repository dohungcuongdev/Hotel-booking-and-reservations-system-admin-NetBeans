/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import DAO.user.DAOUser;
import DAO.user.ImpUserDAO;

/**
 *
 * @author Do Hung Cuong
 */
public class Test {

    public static void main(String args[]) {
        ImpUserDAO d = new ImpUserDAO();

        System.out.println(d.getListFollowUsersChartData(d.getListFollowUsers()));

    }

}
