/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Information;

/**
 *
 * @author PC
 */
public class Subject {
    private String Mamh;
    private String Tenmh;
    private int Sotiet;
    private String Loaimh;

    public Subject() {
    }

    public Subject(String Mamh, String Tenmh, int Sotiet, String Loaimh) {
        this.Mamh = Mamh;
        this.Tenmh = Tenmh;
        this.Sotiet = Sotiet;
        this.Loaimh = Loaimh;
    }

    public String getMamh() {
        return Mamh;
    }

    public String getTenmh() {
        return Tenmh;
    }

    public int getSotiet() {
        return Sotiet;
    }

    public String getLoaimh() {
        return Loaimh;
    }

    public void setMamh(String Mamh) {
        this.Mamh = Mamh;
    }

    public void setTenmh(String Tenmh) {
        this.Tenmh = Tenmh;
    }

    public void setSotiet(int Sotiet) {
        this.Sotiet = Sotiet;
    }

    public void setLoaimh(String Loaimh) {
        this.Loaimh = Loaimh;
    }
}
