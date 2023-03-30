/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOC;

import Information.TaiKhoan;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

public class AccountInDB {

    public boolean kiemtra(String accountname, String password) {
        Connection conn = ConnectSql.Connect.connectionDatabase();
        try {
            String sql = "SELECT COUNT(*) FROM TAIKHOAN WHERE TENTAIKHOAN=? AND MATKHAU=?";
            PreparedStatement str = conn.prepareStatement(sql);
            str.setString(1, accountname);
            str.setString(2, password);
            ResultSet rs = str.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    return true;
                }
            }
        } catch (SQLException ex) {
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
            }
        }
        return false;
    }
}
