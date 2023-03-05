/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gara.DAO;

import java.util.List;

/**
 *
 * @author lanpr
 */
public abstract class GaraSysDao<E,K> {
        abstract public void insert(E entity);
        abstract public void update(E entity);
        abstract public void delete(K id);
        abstract public E selectbyID(K id);
        abstract public List<E> selectAll();
        abstract public List<E> selectSQL(String sql, Object...args);
}