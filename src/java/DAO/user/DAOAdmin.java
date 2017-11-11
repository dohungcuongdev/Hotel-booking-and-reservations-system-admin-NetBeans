/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.user;

import model.user.Administrator;

/**
 *
 * @author Do Hung Cuong
 */
public interface DAOAdmin {

    public Administrator getAdminByUserName(String username);

    public void updateAdmin(Administrator ad);

    public void updatePassword(String currentpassword, String correctpassword, String newpassword, String confirm);

    public void editProfileImg(String username, String img);
}
