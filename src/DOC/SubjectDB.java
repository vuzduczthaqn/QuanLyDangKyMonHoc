/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOC;
import Information.Subject;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class SubjectDB {
    private List arrSubject;

    public SubjectDB() {
       arrSubject= new ArrayList();
    }

    public SubjectDB(List arrSubject) {
        this.arrSubject = arrSubject;
    }
    public List showList() throws SQLException {
        Connection conn=ConnectSql.Connect.connectionDatabase();
        String sql = "SELECT * FROM SUBJECT";
        PreparedStatement prs=conn.prepareStatement(sql);
        ResultSet rs=prs.executeQuery();
        while (rs.next()) {
            Subject sj=new Subject();
            sj.setMamh(rs.getString("MAMONHOC"));
            sj.setTenmh(rs.getString("TENMONHOC"));
            sj.setSotiet(rs.getInt("SOTIET"));
            sj.setLoaimh(rs.getString("LOAIMONHOC"));
            arrSubject.add(sj);
        }
        return arrSubject;
    }
}
