/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gara.DAO;

import gara.modal.HoaDon;
import gara.modal.KhachHang;
import gara.utils.Auth;
import gara.utils.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lanpr
 */
public class HoaDonDao extends GaraSysDao<HoaDon, String> {

    @Override
    public void insert(HoaDon entity) {
        JDBCHelper.update("INSERT INTO HoaDon VALUES(?,?,?,?,?,?)", entity.getMaHD(), entity.getMaNV(), entity.getMaKH(), entity.getNgayTaoHD(), entity.getTongTien(), entity.getTrangThai());
    }

    @Override
    public void update(HoaDon entity) {
        JDBCHelper.update("UPDATE HoaDon set MaNV=? ,MaKH=? ,NgayTaoHD=? ,ThanhTien=? ,TrangThai=? where MaHD=?",entity.getMaNV(), entity.getMaKH(),entity.getNgayTaoHD(),entity.getTongTien(),entity.getTrangThai(), entity.getMaHD());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update("Delete from HoaDon where MaHD=?", id);
    }

    @Override
    public HoaDon selectbyID(String id) {
        try {
            ResultSet rs = JDBCHelper.query("SELECT * FROM HoaDon Where MAHD=?", id);
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getString(1));
                hd.setMaNV(rs.getString(2));
                hd.setMaKH(rs.getString(3));
                hd.setNgayTaoHD(rs.getString(4));
                hd.setTongTien(rs.getInt(5));
                hd.setTrangThai(rs.getBoolean(6));
                return hd;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public ArrayList<HoaDon> selectAll() {
        String sql = "Select * from HoaDon";
        return this.selectSQL(sql);

    }

    @Override
    public ArrayList<HoaDon> selectSQL(String sql, Object... args) {
        ArrayList<HoaDon> listHD = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HoaDon hd =new HoaDon();
                hd.setMaHD(rs.getString(1));
                hd.setMaNV(rs.getString(2));
                hd.setMaKH(rs.getString(3));
                hd.setNgayTaoHD(rs.getString(4));
                hd.setTongTien(rs.getInt(5));
                hd.setTrangThai(rs.getBoolean(6)); 
                listHD.add(hd);
            }
            rs.getStatement().getConnection().close();
            return listHD;
        } catch (Exception ex) {
            throw new RuntimeException();
        }
    }
    
}


