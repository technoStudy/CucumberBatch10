package utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtilities {

    protected static Statement statement;
    private static Connection connection;

    @BeforeMethod
    public static void DBConnection() {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        try {
            connection = DriverManager.getConnection(url, username, password);

            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterMethod
    public void DBConnectionClose() throws SQLException {
        connection.close();
    }

    public static List<List<String>> getData(String query) {
        List<List<String>> returnList = new ArrayList<>();
        DBConnection();

        try {
          ResultSet rs = statement.executeQuery(query);

          while (rs.next()){ // next returns false if there is no next row. We don't need to get number of rows of our result

          }









        } catch (SQLException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }


    }
}
