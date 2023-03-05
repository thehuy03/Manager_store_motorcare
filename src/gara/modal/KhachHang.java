/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gara.modal;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String MaKH;
    private String TenKH;
    private String DienThoai;
    private String DiaChi;
    private String Loaixe;
    private String BienSo;
    private String YeuCauKH;
 

    public KhachHang() {
    }

    public KhachHang(String MaKH, String TenKH, String DienThoai, String DiaChi, String Loaixe, String BienSo, String YeuCauKH) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.DienThoai = DienThoai;
        this.DiaChi = DiaChi;
        this.Loaixe = Loaixe;
        this.BienSo = BienSo;
        this.YeuCauKH = YeuCauKH;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getLoaixe() {
        return Loaixe;
    }

    public void setLoaixe(String Loaixe) {
        this.Loaixe = Loaixe;
    }

    public String getBienSo() {
        return BienSo;
    }

    public void setBienSo(String BienSo) {
        this.BienSo = BienSo;
    }

    public String getYeuCauKH() {
        return YeuCauKH;
    }

    public void setYeuCauKH(String YeuCauKH) {
        this.YeuCauKH = YeuCauKH;
    }

    
    
}
