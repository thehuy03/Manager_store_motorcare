/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gara.DAO;

import gara.modal.HoaDon;
import gara.modal.HoaDonChiTiet;
import gara.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lanpr
 */
public class HoaDonCTDao extends GaraSysDao<HoaDonChiTiet, String> {

    @Override
    public void insert(HoaDonChiTiet entity) {
        JDBCHelper.update("Insert into HoaDonCT(MaHD,MaDV,MaLK,SoLuong) values(?,?,?,?)", entity.getMaHD(), entity.getMaDV(), entity.getMaLK(), entity.getSoluong());
    }

    @Override
    public void update(HoaDonChiTiet entity) {
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update("Delete from HoaDonCT where MaHDCT=?", id);
    }

    @Override
    public HoaDonChiTiet selectbyID(String id) {
        try {
            ResultSet rs = JDBCHelper.query("SELECT * FROM HoaDonCT Where MAHD=?", id);
            while (rs.next()) {
                HoaDonChiTiet hdct = new HoaDonChiTiet();
                hdct.setMaHDCT(rs.getString(1));
                hdct.setMaHD(rs.getString(2));
                hdct.setMaDV(rs.getString(3));
                hdct.setMaLK(rs.getString(4));
                hdct.setSoluong(rs.getInt(5));
                hdct.setDonGia(rs.getDouble(6));
                return hdct;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public ArrayList<HoaDonChiTiet> selectAll() {
        String sql = "Select * from HoaDonCT";
        return this.selectSQL(sql);
    }

    @Override
    public ArrayList<HoaDonChiTiet> selectSQL(String sql, Object... args) {
        ArrayList<HoaDonChiTiet> listHDCT = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HoaDonChiTiet hdct = new HoaDonChiTiet();
                hdct.setMaHDCT(rs.getString(1));
                hdct.setMaHD(rs.getString(2));
                hdct.setMaDV(rs.getString(3));
                hdct.setMaLK(rs.getString(4));
                hdct.setSoluong(rs.getInt(5));
                hdct.setDonGia(rs.getDouble(6));
                listHDCT.add(hdct);
            }
            rs.getStatement().getConnection().close();
            return listHDCT;
        } catch (Exception ex) {
            throw new RuntimeException();
        }

    }
   

}
