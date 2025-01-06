package Creational.ObjectPool;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    Connection sqlConnection;

    public DBConnection() {
        System.out.println("Getting DB Connection");
        //this.sqlConnection = DriverManager.getConnection("url","username", "password");
    }
}
