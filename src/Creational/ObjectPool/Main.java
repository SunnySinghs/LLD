package Creational.ObjectPool;

public class Main {
    public static void main(String[] args) {
        DBConnectionPoolManager dbConnectionPoolManager = DBConnectionPoolManager.getInstance();

        DBConnection dbConnection1 = dbConnectionPoolManager.getDBConnection();
        DBConnection dbConnection2 = dbConnectionPoolManager.getDBConnection();
        DBConnection dbConnection3 = dbConnectionPoolManager.getDBConnection();
        DBConnection dbConnection4 = dbConnectionPoolManager.getDBConnection();
        dbConnectionPoolManager.getDBConnection();

        dbConnectionPoolManager.releaseDBConnection(dbConnection4);
    }
}
