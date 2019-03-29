package Database;

import java.sql.*;

public class Database {
    public static final String DEFAULT_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    public static String hostname = "localhost";
    public static String dbName = "TextAdventure";
    public static int port = 3306;
    public static final String DEFAULT_URL = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName;
    private static final String DEFAULT_USERNAME = "master";
    private static final String DEFAULT_PASSWORD = "secure123";

    public static void main(String[] args) {

        printText(1);

    }

    public static void printText(int id){
        try{
            Class.forName(DEFAULT_DRIVER_CLASS);
            Connection connection = DriverManager.getConnection(DEFAULT_URL, DEFAULT_USERNAME, DEFAULT_PASSWORD);


            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = connection.prepareStatement("SELECT text FROM story WHERE id = " + id);
            rs = ps.executeQuery();

            System.out.println(rs.getString(0));
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }catch(Exception e){

        }
    }
}
