/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatexml;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import pojo.UserData;

/**
 *
 * @author Mohammmed Sami
 */
public class HibernateXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        
        UserData userData = new UserData();
        userData.setAge(23);
        userData.setUserName("Mohammed Sami");
        try{
            
            session.beginTransaction();
            session.save(userData);
            session.getTransaction().commit();
        }catch(HibernateException h ){
            h.printStackTrace();
            session.getTransaction().rollback();
            
        }finally{
            session.close();
        }
        
        
    }
    
}
