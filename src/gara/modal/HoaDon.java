/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gara.modal;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private String MaHD;
    private String MaNV;
    private String MaKH;
    private String NgayTaoHD;
    private int TongTien;
    private boolean TrangThai;

    public HoaDon() {
    }

    public HoaDon(String MaHD, String MaNV, String MaKH, String NgayTaoHD, int TongTien, boolean TrangThai) {
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.NgayTaoHD = NgayTaoHD;
        this.TongTien = TongTien;
        this.TrangThai = TrangThai;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getNgayTaoHD() {
        return NgayTaoHD;
    }

    public void setNgayTaoHD(String NgayTaoHD) {
        this.NgayTaoHD = NgayTaoHD;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
      
}
