/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.hotel;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import service.application.EditImageDBService;

/**
 *
 * @author Do Hung Cuong
 */
public class ImpHotelItemDAO implements HotelItemDAO {

    protected DBCollection collection;

    @Override
    public void editImage(String name, String img, String img2) {
        EditImageDBService.editImagebyName(collection, name, "img", img);
        EditImageDBService.editImagebyName(collection, name, "img2", img2);
    }
    
    @Override
    public void deleteItem(String name) {
        collection.remove(new BasicDBObject().append("name", name));
    }

}
