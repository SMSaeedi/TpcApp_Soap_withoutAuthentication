package com.example.demo.dataBaseConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    public static final String MYSQL_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    public static final String MYSQL_URL = "jdbc:mysql://localhost:3306/secured_service_db";
    public static final String MYSQL_USER = "root";
    public static final String MYSQL_PASSWORD = "@zhila920618261*";
    public static final int DATABASE_MIN_ROWS = 1;
    public static final int DATABASE_MAX_ROWS = 1000;

//    static {
//        Logging.info("Setting UP Database!");
//        try {
//            Class.forName(driverName);
//            connectionsPool = new ArrayBlockingQueue<Connection>(DATABASE_CONNECTION_POOL_SIZE + 10);
//            usage = new ConcurrentHashMap<Connection, AtomicInteger>();
//            for (int i = 0; connectionsPool.size() < DATABASE_CONNECTION_POOL_SIZE; i++) {
//                Connection c = null;
//                try {
//                    c = DriverManager.getConnection(url, userName, passwd);
//                } catch (SQLException e) {
//                    Logging.info("Nao consegue criar conn....");
//                    e.printStackTrace();
//                }
//                if (c != null) {
//                    try {
//                        usage.put(c, new AtomicInteger(0));
//                        connectionsPool.put(c);
//                    } catch (InterruptedException ie) {
//                    }
//                }
//            }
//        } catch (Exception e) {
//            Logging.info("Cannot init Database!!!!");
//            e.printStackTrace();
//        } finally {
//
//        }
//        Logging.info("Database UP!");
//    }

    public static Statement createMaxStatement(final Connection con) throws SQLException {
        Statement st = con.createStatement();
        st.setMaxRows(DATABASE_MAX_ROWS);
        return st;
    }

    public static Statement createMinStatement(final Connection con) throws SQLException {
        Statement st = con.createStatement();
        st.setMaxRows(DATABASE_MIN_ROWS);
        return st;
    }

    public static Connection createCon() {
        Connection con = null;
        try {
            Class.forName(MYSQL_DRIVER_CLASS);
            con = DriverManager.getConnection(MYSQL_URL
                    , MYSQL_USER, MYSQL_PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("database connection failed");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("database driver incorrect");
            e.printStackTrace();
        }
        return con;
    }
}