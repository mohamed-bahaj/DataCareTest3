package ConnectionSingleton;

import sample.Controller;

import java.sql.*;

public class ConnectionToDB {

    private static String url = "jdbc:mysql://localhost:3306/datacare";
    private static String user = "java";
    private static String password = "password";
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