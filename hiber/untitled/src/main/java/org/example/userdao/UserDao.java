package org.example.userdao;
import org.example.models.Auto;
import org.example.models.User;
import org.example.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.dialect.H2Dialect;

import java.util.List;

public class UserDao {
    public User findById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        User user = session.get(User.class, id);
        session.close();
        return user;
    }
public Auto findAutoById(int id){
        Session session = null;
        Auto auto = null;
        try {
            session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
            auto = session.get(Auto.class, id);

        }
        catch(Exception e){
            System.out.println("Exception");

        }
        finally {
            if(session != null && session.isOpen()){
                session.close();
            }
        }
        return auto;
}
    public void save(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }
    public void update(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }
    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }
    public List<User> findAll() {
        Session session = null;
        List<User> users  = null ;
        try {
            session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
            String hqlQuery = "From User";
            users = (List<User>)  session.createNamedQuery("From User").list();
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return users;
    }

}
