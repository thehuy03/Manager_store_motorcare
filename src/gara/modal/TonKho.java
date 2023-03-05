/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gara.modal;

/**
 *
 * @author Admin
 */
public class TonKho {
    private String MaLK;
    private String TenLK;
    private String LoaiLK;
    private String HangSX;
    private int SoLuong;
    private double DonGia;

    public TonKho() {
    }

    public TonKho(String MaLK, String TenLK, String LoaiLK, String HangSX, int SoLuong, double DonGia) {
        this.MaLK = MaLK;
        this.TenLK = TenLK;
        this.LoaiLK = LoaiLK;
        this.HangSX = HangSX;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public String getMaLK() {
        return MaLK;
    }

    public void setMaLK(String MaLK) {
        this.MaLK = MaLK;
    }

    public String getTenLK() {
        return TenLK;
    }

    public void setTenLK(String TenLK) {
        this.TenLK = TenLK;
    }

    public String getLoaiLK() {
        return LoaiLK;
    }

    public void setLoaiLK(String LoaiLK) {
        this.LoaiLK = LoaiLK;
    }

    public String getHangSX() {
        return HangSX;
    }

    public void setHangSX(String HangSX) {
        this.HangSX = HangSX;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

   
}
