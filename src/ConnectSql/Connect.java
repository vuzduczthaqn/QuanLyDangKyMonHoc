/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectSql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connect {
    public static Connection connectionDatabase() {
        Connection conn=null;
        try {
        String dbURL = "jdbc:sqlserver://localhost;databaseName=QUANLYTRUONGHOC";
        String user = "sa";
        String pass = "vdt1410";
                conn = DriverManager.getConnection(dbURL, user, pass);

        } catch (SQLException e) {
            System.out.println("ConnectSql.Connect.connectionDatabase()");
        }
        return conn;

    }
    public static Connection closeconnection(Connection conn) throws SQLException {
            conn.close();
            return conn;
    }
}
