/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gara.DAO;

import gara.modal.TonKho;
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
public class KhoDAO extends GaraSysDao<TonKho, String> {

    @Override
    public void insert(TonKho entity) {
        JDBCHelper.update("INSERT INTO Kho VALUES(?,?,?,?,?,?)",
                entity.getMaLK(),
                entity.getTenLK(),
                entity.getLoaiLK(),
                entity.getHangSX(),
                entity.getSoLuong(),
                entity.getDonGia());
    }

    @Override
    public void update(TonKho entity) {
        JDBCHelper.update("UPDATE Kho set TenLK=?,LoaiLK=?,HangSX=?,SoLuong=?,DOnGia=? where MaLK=?",
                entity.getTenLK(),
                entity.getLoaiLK(),
                entity.getHangSX(),
                entity.getSoLuong(),
                entity.getDonGia(),
                entity.getMaLK());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update("DELETE FROM Kho where MaLK = ?", id);
    }

    @Override
    public TonKho selectbyID(String id) {
        try {
            ResultSet rs = JDBCHelper.query("SELECT * FROM Kho WHERE MaLK= ?", id);
            while (rs.next()) {
                TonKho kho = new TonKho();
                kho.setMaLK(rs.getString(1));
                kho.setTenLK(rs.getString(2));
                kho.setLoaiLK(rs.getString(3));
                kho.setHangSX(rs.getString(4));
                kho.setSoLuong(rs.getInt(5));
                kho.setDonGia(rs.getDouble(6));
                return kho;
            }
        } catch (SQLException ex) {
        }
        return null;
    }

    @Override
    public ArrayList<TonKho> selectAll() {
        String sql = "Select * from kho";
        return this.selectSQL(sql);
    }

    @Override
    public ArrayList<TonKho> selectSQL(String sql, Object... args) {
        ArrayList<TonKho> listKho = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                TonKho Tkho = new TonKho();
                Tkho.setMaLK(rs.getString(1));
                Tkho.setTenLK(rs.getString(2));
                Tkho.setLoaiLK(rs.getString(3));
                Tkho.setHangSX(rs.getString(4));
                Tkho.setSoLuong(rs.getInt(5));
                Tkho.setDonGia(rs.getDouble(6));
                listKho.add(Tkho);
            }
            rs.getStatement().getConnection().close();
            return listKho;
        } catch (Exception ex) {
            throw new RuntimeException();
        }
    }
}
