/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectMongoDB;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import org.bson.types.ObjectId;

/**
 *
 * @author Do Hung Cuong
 */
public class MongoDBConnector {

    public static DBCollection createConnection(String collectionName) throws UnknownHostException {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("HotelBookingReservationsSystem");
        return db.getCollection(collectionName);
    }

    public static void updateOne(String collectionName, String originalfield, String value, String updatefield, String updatevalue) throws UnknownHostException {
        if (originalfield.equals("id")) {
            createConnection(collectionName).update(
                    new BasicDBObject("_id", new ObjectId(value)),
                    new BasicDBObject("$set", new BasicDBObject(updatefield, updatevalue))
            );
        } else {
            createConnection(collectionName).update(
                    new BasicDBObject(originalfield, value),
                    new BasicDBObject("$set", new BasicDBObject(updatefield, updatevalue))
            );
        }
    }

}
