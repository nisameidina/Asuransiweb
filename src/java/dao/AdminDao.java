/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Admin;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tools.HibernateUtil;

/**
 *
 * @author ASUS A455L
 */
public class AdminDao implements InterfaceDao {

    public Session session;
    public SessionFactory factory;
    public Transaction transaction;
    public FunctionDao fdao;
    
    public AdminDao() {
         this.fdao = new FunctionDao(HibernateUtil.getSessionFactory());
    }

    @Override
    public boolean insert(Object object) {
        return fdao.insert(object);
    }

    @Override
    public boolean update(Object object) {
        return fdao.insert(object);
    }

    @Override
    public boolean delete(Object object) {
        return fdao.delete(Admin.class,object.toString());
    }
    @Override
    public List<Object> getAll() {
        return fdao.getAll("FROM Admin");
    }

    @Override
    public List<Object> search(String category, String cari) {
        return fdao.getAll("FROM Admin WHERE " + category + " LIKE '%" + cari + "%'");
    }

    @Override
    public Object getById(String id) {
        return fdao.getById("from Admin where id_admin ='" + id + "'");
    } 
}
