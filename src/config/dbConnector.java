package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbConnector {

    final private Connection cn;

    public dbConnector() throws SQLException {
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flightreservation","root","");
    }

    public ResultSet getData(String sql) throws SQLException {
        return cn.createStatement().executeQuery(sql);
    }

    public Connection getConnection() throws SQLException {
        return cn;
    }

}
