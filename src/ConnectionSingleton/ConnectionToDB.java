package ConnectionSingleton;

import sample.Controller;

import java.sql.*;

public class ConnectionToDB {

    private static String url = "jdbc:mysql://localhost:3307/data_care";
    private static String user = "mauro";
    private static String password = "admindatacare";
    private static Connection connect;



    public static Connection getInstance(){
        if(connect==null){
            try {
                connect = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connect;
    }

    public void closeConnection(){
        try {
            if (connect != null) {
                connect.close();
                System.out.println("connection closed");

            }
        } catch (Exception e) {
            //do nothing
        }
    }



}