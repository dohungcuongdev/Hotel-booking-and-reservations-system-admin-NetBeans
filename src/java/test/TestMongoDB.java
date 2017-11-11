/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import DAO.hotel.ImpRoomDAO;
import DAO.hotel.ImpServiceDAO;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import connectMongoDB.MongoDBConnector;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import DAO.hotel.DAORoom;
import DAO.hotel.DAOService;
import org.bson.types.ObjectId;

/**
 *
 * @author Do Hung Cuong
 */
public class TestMongoDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            //connect mongodb
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("HotelBookingReservationsSystem");
            System.out.println("Connect Mongo Successfully");

            //define collection of mongodb
            DBCollection collection = db.getCollection("rooms");

            //find the first object
            System.out.println("1. Find first matched document");
            DBObject dbObject = collection.findOne();
            System.out.println(dbObject);

            //find all objects
            System.out.println("\n1. Find all matched documents");
            DBCursor cursor = collection.find();
            while (cursor.hasNext()) {
                System.out.println(cursor.next());
            }

            //find all objects
            System.out.println("\n1. Get 'name' field only");
            BasicDBObject allQuery = new BasicDBObject();
            BasicDBObject fields = new BasicDBObject();
            fields.put("name", 1);
            DBCursor cursor2 = collection.find(allQuery, fields);
            while (cursor2.hasNext()) {
                System.out.println(cursor2.next());
            }

            //find all objects with price = 100
            System.out.println("\n2. Find where price = 100");
            BasicDBObject whereQuery = new BasicDBObject();
            whereQuery.put("price", 100);
            DBCursor cursor3 = collection.find(whereQuery);
            while (cursor3.hasNext()) {
                System.out.println(cursor3.next());
            }

            //find all objects with price = 100,200,300
            System.out.println("\n2. Find where price in 100,200 and 300");
            BasicDBObject inQuery = new BasicDBObject();
            List<Integer> list = new ArrayList<>();
            list.add(100);
            list.add(200);
            list.add(300);
            inQuery.put("price", new BasicDBObject("$in", list));
            DBCursor cursor4 = collection.find(inQuery);
            while (cursor4.hasNext()) {
                System.out.println(cursor4.next());
            }

            //find all objects with 200 > price > 100
            System.out.println("\n2. Find where 200 > price > 100");
            BasicDBObject gtQuery = new BasicDBObject();
            gtQuery.put("price", new BasicDBObject("$gt", 100).append("$lt", 200));
            DBCursor cursor5 = collection.find(gtQuery);
            while (cursor5.hasNext()) {
                System.out.println(cursor5.next());
            }

            //find all objects with price != 100
            System.out.println("\n2. Find where price != 100");
            BasicDBObject neQuery = new BasicDBObject();
            neQuery.put("price", new BasicDBObject("$ne", 100));
            DBCursor cursor6 = collection.find(neQuery);
            while (cursor6.hasNext()) {
                System.out.println(cursor6.next());
            }

            //find all objects with price = 100 and name = Hamburger
            System.out.println("\n3. Find when price = 100 and name = 'Hamburger'");
            BasicDBObject andQuery = new BasicDBObject();
            List<BasicDBObject> obj = new ArrayList<>();
            obj.add(new BasicDBObject("price", 100));
            obj.add(new BasicDBObject("name", "Hamburger"));
            andQuery.put("$and", obj);
            System.out.println(andQuery.toString());

            DBCursor cursor7 = collection.find(andQuery);
            while (cursor7.hasNext()) {
                System.out.println(cursor7.next());
            }

            //remove by id
            collection.remove(new BasicDBObject().append("_id", new ObjectId("5974d0478e8cf9fe89c548ce")));

            // test MongoDBConnector
            System.out.println("\n4. Test MongoDBConnector");
            DBCollection collectionRoom = MongoDBConnector.createConnection("rooms");
            DBCursor cursorRoom = collectionRoom.find();
            while (cursorRoom.hasNext()) {
                System.out.println(cursorRoom.next());
            }

            // test DAO
            System.out.println("\n5. Test roomDAO");
            DAORoom roomDAO = new ImpRoomDAO();
            System.out.println(roomDAO.getAllRooms());

            System.out.println("\n5. Test serviceDAO");
            DAOService serviceDAO = new ImpServiceDAO();
            System.out.println(serviceDAO.getAllHotelServices());

            System.out.println("Are you sure want to drop colection (Yes/No): ");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            if (input.equalsIgnoreCase("Yes")) {
                collection.drop();
            }
            System.out.println("Done");

        } catch (UnknownHostException | MongoException e) {
            System.err.println(e);
        }

    }

}
