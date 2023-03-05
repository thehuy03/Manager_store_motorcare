package gara.modal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class NhanVien {
    private String MaNV;
    private String TenNV;
    private String DienThoai;
    private String Email;
    private String DiaChi;
    private String MatKhau;
    private boolean ChucVu;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String TenNV, String DienThoai, String Email, String DiaChi, String MatKhau, boolean ChucVu) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.DienThoai = DienThoai;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.MatKhau = MatKhau;
        this.ChucVu = ChucVu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public boolean getChucVu() {
        return ChucVu;
    }

    

    public void setChucVu(boolean ChucVu) {
        this.ChucVu = ChucVu;
    }

   

    
}
