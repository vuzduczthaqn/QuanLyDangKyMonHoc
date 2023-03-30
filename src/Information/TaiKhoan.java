/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Information;

import java.util.Objects;

/**
 *
 * @author PC
 */
public class TaiKhoan {
    private String matkhau;
    private String accountname;
    public TaiKhoan(){
    }

    public TaiKhoan(String matkhau, String accountname) {
        this.matkhau = matkhau;
        this.accountname = accountname;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }
    

}
