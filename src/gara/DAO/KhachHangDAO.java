/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gara.DAO;

import gara.modal.KhachHang;
import gara.modal.NhanVien;
import gara.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lanpr
 */
public class KhachHangDAO extends GaraSysDao<KhachHang, String> {

    @Override
    public void insert(KhachHang entity) {
        JDBCHelper.update("INSERT INTO KhachHang VALUES(?,?,?,?,?,?,?)", entity.getMaKH(), entity.getTenKH(), entity.getDienThoai(), entity.getDiaChi(), entity.getLoaixe(), entity.getBienSo(), entity.getYeuCauKH());
    }

    @Override
    public void update(KhachHang entity) {
        JDBCHelper.update("UPDATE KhachHang set TenKH=? , DienThoai=?, DiaChi=?,LoaiXe=?,BienSo=? ,YeuCauKH=? where MaKH=?", entity.getTenKH(), entity.getDienThoai(), entity.getDiaChi(), entity.getLoaixe(), entity.getBienSo(), entity.getYeuCauKH(), entity.getMaKH());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update("DELETE FROM KHACHHANG WHERE MAKH = ?", id);
    }

    @Override
    public KhachHang selectbyID(String id) {
        try {
            ResultSet rs = JDBCHelper.query("SELECT * FROM KHACHHANG Where MAKH=?", id);
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getString(1));
                kh.setTenKH(rs.getString(2));
                kh.setDienThoai(rs.getString(3));
                kh.setDiaChi(rs.getString(4));
                kh.setLoaixe(rs.getString(5));
                kh.setBienSo(rs.getString(6));
                kh.setYeuCauKH(rs.getString(7));
                return kh;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public List<KhachHang> selectAll() {
        String sql = "Select * from KhachHang";
        return this.selectSQL(sql);
    }

    @Override
    public List<KhachHang> selectSQL(String sql, Object... args) {
        List<KhachHang> listKH = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                KhachHang kh =new KhachHang();
                kh.setMaKH(rs.getString(1));
                kh.setTenKH(rs.getString(2));
                kh.setDienThoai(rs.getString(3));
                kh.setDiaChi(rs.getString(4));
                kh.setLoaixe(rs.getString(5));
                kh.setBienSo(rs.getString(6));
                kh.setYeuCauKH(rs.getString(7));
                listKH.add(kh);
            }
            rs.getStatement().getConnection().close();
            return listKH;
        } catch (Exception ex) {
            throw new RuntimeException();
        }        }

}
