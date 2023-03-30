/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Information;

import java.util.Objects;
public class SinhVien {
    private String masv;
    private String hoten;
    private date ngaysinh;
    private String quequan;
    private String sdt;
    private String email;
	public SinhVien(String masv, String hoten, date ngaysinh, String quequan, String sdt, String email) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.quequan = quequan;
		this.sdt = sdt;
		this.email = email;
	}
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getQuequan() {
		return quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
        	@Override
	public int hashCode() {
		return Objects.hash(masv);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(masv, other.masv);
	}
}

