package com.ly;


import java.sql.*;

/**
 * Created by Liuying on 2018/10/22.
 */
public class OracleUtil {
    public static void main(String[] args) {
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String dbURL = "jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS = (PROTOCOL = TCP)(HOST = 134.96.129.27)(PORT = 1522))(ADDRESS = (PROTOCOL = TCP)(HOST = 134.96.129.28)(PORT = 1522))(LOAD_BALANCE = yes)(FAILOVER = ON)(CONNECT_DATA =(SERVER = DEDICATED)(SERVICE_NAME = report)(FAILOVER_MODE=(TYPE = SELECT)(METHOD = BASIC)(RETIRES = 20)(DELAY = 15))))";
            System.out.println("连接开始");
            conn = DriverManager.getConnection(dbURL, "report", "report");
            System.out.println("连接成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                    rs = null;
                }
                if (stmt != null) {
                    stmt.close();
                    stmt = null;
                }
                if (conn != null) {
                    conn.close();
                    conn = null;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
