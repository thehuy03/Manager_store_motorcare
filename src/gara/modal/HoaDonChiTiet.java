/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gara.modal;

/**
 *
 * @author lanpr
 */
public class HoaDonChiTiet {
    private String MaHDCT;
    private String MaHD;
    private String MaDV;
    private String MaLK;
    private int Soluong;
    private double DonGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String MaHDCT, String MaHD, String MaDV, String MaLK, int Soluong, double DonGia) {
        this.MaHDCT = MaHDCT;
        this.MaHD = MaHD;
        this.MaDV = MaDV;
        this.MaLK = MaLK;
        this.Soluong = Soluong;
        this.DonGia = DonGia;
    }

    public String getMaHDCT() {
        return MaHDCT;
    }

    public void setMaHDCT(String MaHDCT) {
        this.MaHDCT = MaHDCT;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getMaLK() {
        return MaLK;
    }

    public void setMaLK(String MaLK) {
        this.MaLK = MaLK;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }
    
}
