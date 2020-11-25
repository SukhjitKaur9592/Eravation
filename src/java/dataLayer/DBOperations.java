package dataLayer;

import java.sql.*;

public abstract class DBOperations {

    protected Connection con = null;

    protected void makeConnection() {
        try {
            if (con == null) {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                 con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-IFTD8MQK\\anmol:49693;databaseName=EravationDB;username=sa;password=anmol@1996");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
