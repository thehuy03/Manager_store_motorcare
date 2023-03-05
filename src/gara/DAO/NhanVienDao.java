/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gara.DAO;

import gara.modal.NhanVien;
import java.util.List;
import gara.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lanpr
 */
public class NhanVienDao extends GaraSysDao<NhanVien, String> {

    @Override
    public void insert(NhanVien entity) {
        JDBCHelper.update("INSERT INTO NHANVIEN VALUES(?,?,?,?,?,?,?)", entity.getMaNV(), entity.getTenNV(), entity.getDienThoai(), entity.getEmail(), entity.getDiaChi(), entity.getMatKhau(), entity.getChucVu());
    }

    @Override
    public void update(NhanVien entity) {
        JDBCHelper.update("UPDATE NHANVIEN SET TenNV=?,DienThoai=?,Email=?,DiaChi=?,MatKhau=?,ChucVu=? WHERE MANV = ?", entity.getTenNV(), entity.getDienThoai(), entity.getEmail(), entity.getDiaChi(), entity.getMatKhau(), entity.getChucVu(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update("DELETE FROM NHANVIEN WHERE MANV = ?", id);
    }

    @Override
    public NhanVien selectbyID(String id) {
        try {
            ResultSet rs = JDBCHelper.query("SELECT * FROM NHANVIEN WHERE MaNV= ?", id);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString(1));
                nv.setTenNV(rs.getString(2));
                nv.setDienThoai(rs.getString(3));
                nv.setEmail(rs.getString(4));
                nv.setDiaChi(rs.getString(5));
                nv.setMatKhau(rs.getString(6));
                nv.setChucVu(rs.getBoolean(7));
                return nv;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public List<NhanVien> selectAll() {
        String sql="Select * from nhanvien";
        return this.selectSQL(sql);
    }

    @Override
    public List<NhanVien> selectSQL(String sql, Object... args) {
        List<NhanVien> listNV = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString(1));
                nv.setTenNV(rs.getString(2));
                nv.setDienThoai(rs.getString(3));
                nv.setEmail(rs.getString(4));
                nv.setDiaChi(rs.getString(5));
                nv.setMatKhau(rs.getString(6));
                nv.setChucVu(rs.getBoolean(7));
                listNV.add(nv);
            }
            rs.getStatement().getConnection().close();
            return listNV;
        } catch (Exception ex) {
            throw new RuntimeException();
        }    
    }
    public void doiMk(String mk,String email){
        JDBCHelper.update("Update NhanVien set matkhau=? where email=?",mk,email );
    }
   
    
}
