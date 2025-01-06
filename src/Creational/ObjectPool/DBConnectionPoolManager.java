package Creational.ObjectPool;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    private List<DBConnection> freeConnectionInPool;
    private List<DBConnection> connectionCurrentlyInUse;
    private final int INITIAL_POOL_SIZE;
    private final int MAX_POOL_SIZE;
    private static DBConnectionPoolManager dbConnectionPoolManager;

    private DBConnectionPoolManager() {
        INITIAL_POOL_SIZE = 2;
        MAX_POOL_SIZE = 4;
        freeConnectionInPool = new ArrayList<>();
        connectionCurrentlyInUse = new ArrayList<>();
        for (int i=0; i<INITIAL_POOL_SIZE; i++) {
            freeConnectionInPool.add(new DBConnection());
        }
    }

    // Class must be singleton
    public static DBConnectionPoolManager getInstance() {
        if (dbConnectionPoolManager == null) {
            synchronized (DBConnectionPoolManager.class) {
                if (dbConnectionPoolManager == null) {
                    dbConnectionPoolManager = new DBConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManager;
    }

    //Thread Safety is important
    public synchronized DBConnection getDBConnection() {
        if (freeConnectionInPool.isEmpty() && connectionCurrentlyInUse.size() < MAX_POOL_SIZE) {
            freeConnectionInPool.add(new DBConnection());
            System.out.println("Creating new connection. Free pool size: " + freeConnectionInPool.size());
        } else if (freeConnectionInPool.isEmpty() && connectionCurrentlyInUse.size() >= MAX_POOL_SIZE) {
            System.out.println("Can't create new connection, as max limit reached");
            return null;
        }
        DBConnection dbConnection = freeConnectionInPool.removeLast();
        connectionCurrentlyInUse.add(dbConnection);
        System.out.println("Adding db connection into use pool. Use pool size: " + connectionCurrentlyInUse.size());
        return dbConnection;
    }

    public synchronized void releaseDBConnection(DBConnection dbConnection) {
        if (dbConnection != null) {
            connectionCurrentlyInUse.remove(dbConnection);
            System.out.println("Removing DB connection from use pool, size: "+ connectionCurrentlyInUse.size());
            freeConnectionInPool.add(dbConnection);
            System.out.println("Removing DB connection from free pool, size: "+ freeConnectionInPool.size());
        }
    }
}
