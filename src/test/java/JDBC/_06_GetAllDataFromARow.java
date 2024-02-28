package JDBC;

import org.testng.annotations.Test;
import utilities.DBUtilities;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _06_GetAllDataFromARow extends DBUtilities {

    @Test
    void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData(); // Gives all information about the table(column names, column types, number of columns etc.)

        int columnCount = rsmd.getColumnCount(); // gives the number of the columns
        System.out.println("columnCount = " + columnCount);

        rs.next();

        for (int j = 1; j <= columnCount; j++) {

                String columnType = rsmd.getColumnTypeName(j); // gives the data type of the column
                System.out.print("columnType = " + columnType);

                String columnName = rsmd.getColumnName(j); // gives the title of the column
                System.out.print(" columnName = " + columnName);

                String value = rs.getString(j);
                System.out.print(" value = " + value);
                System.out.println();
            }


        // below code gives everything from the table
//        rs.last();
//        int numberOfRows = rs.getRow();
//        rs.first();
//
//        for (int i = 1; i <= numberOfRows; i++) {
//            for (int j = 1; j <= columnCount; j++) {
//
//                String columnType = rsmd.getColumnTypeName(j); // gives the data type of the column
//                System.out.print("columnType = " + columnType);
//
//                String columnName = rsmd.getColumnName(j); // gives the title of the column
//                System.out.print(" columnName = " + columnName);
//
//                String value = rs.getString(j);
//                System.out.print(" value = " + value);
//                System.out.println();
//            }
//            rs.next();
//        }
    }
}
