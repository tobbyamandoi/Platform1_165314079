/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Pasien;
import util.Rsku79HibernateUtil;

/**
 *
 * @author basisa20
 */
public class pasienHelper {

    public pasienHelper() {
    }
    public List<Pasien> getAllPasien(){
        List<Pasien> result = null;
        Session session = Rsku79HibernateUtil.getSessionFactory().openSession();
        String query = "from Pasien p";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    }
    public void addNewPasien(
            String noRm, 
            String nama, 
            String alamat, 
            String nik, 
            Date tanggalLahir, 
            String kelamin){
        Session session = Rsku79HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Pasien pasien = new Pasien(noRm, nama, alamat, noRm, tanggalLahir, kelamin);
        session.saveOrUpdate(pasien);
        transaction.commit();
        session.close();
    }
}
