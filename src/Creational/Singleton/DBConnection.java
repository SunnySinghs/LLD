package Creational.Singleton;

//Eager Initialization
public class DBConnection {
    private static DBConnection con = new DBConnection();

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        return con;
    }
}

//Lazy Initialization
class DBConnection1 {
    private static DBConnection1 con;

    private DBConnection1() {
    }

    public static DBConnection1 getInstance() {
        if (con == null) {
            con = new DBConnection1();
        }
        return con;
    }
}

//Synchronized Method
class DBConnection2 {
    private static DBConnection2 con;

    private DBConnection2() {
    }

    synchronized public static DBConnection2 getInstance() {
        if (con == null) {
            con = new DBConnection2();
        }
        return con;
    }
}

//Double Check Locking
class DBConnection3 {
    private static volatile DBConnection3 con;  //Volatile is used to create object directly on memory rather than l1 cache

    private DBConnection3() {
    }

    public static DBConnection3 getInstance() {
        if (con == null) {
            synchronized (DBConnection3.class) {
                if (con == null) {
                    con = new DBConnection3();
                }
            }
        }
        return con;
    }
}

// Bill Pugh
class DBConnection4 {
    private DBConnection4() {
    }

    public static class DBConnectionHelper {
        private static final DBConnection4 con = new DBConnection4();
    }
    public static DBConnection4 getInstance() {
        return DBConnectionHelper.con;
    }
}

enum DBConnection5{
    CON;
}
