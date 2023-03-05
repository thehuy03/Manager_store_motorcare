/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gara.DAO;

import gara.modal.DichVu;
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

public class DichVuDao extends GaraSysDao<DichVu, String>{

    @Override
    public void insert(DichVu entity) {
        JDBCHelper.update("INSERT INTO DichVu VALUES(?,?,?)", entity.getMaDV(),entity.getTenDV(),entity.getGiaDichVu());
    }

    @Override
    public void update(DichVu entity) {
        JDBCHelper.update("UPDATE DichVu set TenDV=?,GiaDV=? where MaDV=?",entity.getTenDV(),entity.getGiaDichVu(),entity.getMaDV());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update("delete from dichVu where MaDV=?",id);
    }

    @Override
    public DichVu selectbyID(String id) {
        try {
            ResultSet rs = JDBCHelper.query("SELECT * FROM DichVu where MaDV= ?", id);
            while (rs.next()) {
                DichVu dv=new DichVu();
                dv.setMaDV(rs.getString(1));
                dv.setTenDV(rs.getString(2));
                dv.setGiaDichVu(rs.getDouble(3));   
                return dv;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public List<DichVu> selectAll() {
            String sql="Select * from DichVu";
            return this.selectSQL(sql);
    }

    @Override
    public List<DichVu> selectSQL(String sql, Object... args) {
        List<DichVu> listDV = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
               DichVu dv=new DichVu();
                dv.setMaDV(rs.getString(1));
                dv.setTenDV(rs.getString(2));
                dv.setGiaDichVu(rs.getDouble(3));                
                listDV.add(dv);
            }
            rs.getStatement().getConnection().close();
            return listDV;
        } catch (Exception ex) {
            throw new RuntimeException();
        }    
    }
    
}
