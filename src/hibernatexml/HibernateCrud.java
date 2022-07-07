/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatexml;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import pojo.Address;
import pojo.Employee;
import pojo.UserData;

/**
 *
 * @author Mohammmed Sami
 */
public class HibernateCrud {
    
    public void insertUserData(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        
        UserData userData = new UserData();
        userData.setAge(23);
        userData.setUserName("Mohammed Sami");
        try{
            
            session.beginTransaction();
            session.save(userData);
            session.getTransaction().commit();
        }catch(HibernateException h ){
            session.getTransaction().rollback();
            
        }finally{
            session.close();
        }
    }
    
    public void insertEmployee(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        
        Address homrAddress = new Address();
        homrAddress.setState("Menofia2");
        homrAddress.setCity("Sadat City2");
        homrAddress.setStreet("Akhmas2");
        
        Address workAddress = new Address();
        workAddress.setCity("Nasr City2");
        workAddress.setState("Cairo2 ");
        workAddress.setStreet("Fangary2");
        
        Employee employee = new Employee();
        employee.setAd(homrAddress);
        employee.setWorkAd(workAddress);
        employee.setName("Mohammed Sami2");

        try{
            
            session.beginTransaction();
            session.save(employee);

            session.getTransaction().commit();
        }catch(HibernateException h ){
            session.getTransaction().rollback();
            
        }finally{
            session.close();
        }
    }
    
}
