package com.example.baikiemtra.sv;

import java.io.Serializable;

public class sinhvien implements Serializable {
    private String hoten;
    private String email;
    private String dienthoai;
    private String lich;
    private String hocphi;
    private String magiamgia;

    public sinhvien(String hoten, String email, String dienthoai, String lich, String hocphi, String magiamgia) {
        this.hoten = hoten;
        this.email = email;
        this.dienthoai = dienthoai;
        this.lich = lich;
        this.hocphi = hocphi;
        this.magiamgia = magiamgia;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getLich() {
        return lich;
    }

    public void setLich(String lich) {
        this.lich = lich;
    }

    public String getHocphi() {
        return hocphi;
    }

    public void setHocphi(String hocphi) {
        this.hocphi = hocphi;
    }

    public String getMagiamgia() {
        return magiamgia;
    }

    public void setMagiamgia(String magiamgia) {
        this.magiamgia = magiamgia;
    }
}
