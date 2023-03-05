/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gara.modal;

/**
 *
 * @author Admin
 */
public class DichVu {
    private String MaDV;
    private String TenDV;
    private Double GiaDichVu;
    public DichVu() {
    }

    public DichVu(String MaDV, String TenDV, Double GiaDichVu) {
        this.MaDV = MaDV;
        this.TenDV = TenDV;
        this.GiaDichVu = GiaDichVu;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getTenDV() {
        return TenDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public Double getGiaDichVu() {
        return GiaDichVu;
    }

    public void setGiaDichVu(Double GiaDichVu) {
        this.GiaDichVu = GiaDichVu;
    }
    
}
