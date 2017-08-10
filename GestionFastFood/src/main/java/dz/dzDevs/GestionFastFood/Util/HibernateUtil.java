package dz.dzDevs.GestionFastFood.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();

    //Creer l'objet SessionFactory
    private static SessionFactory buildSessionFactory() {
        try {
            SessionFactory sessFact = new Configuration().configure("config/hibernate.cfg.xml").buildSessionFactory();
            return sessFact;
        } catch (Throwable ex) {
            System.out.println("Failed to create SessionFactory object." + ex);
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    //des methodes utiles
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static Session openSession() {
    	return sessionFactory.openSession();
    }
    
    public Session getCurrentSession() {
    	return sessionFactory.getCurrentSession();
    }
    
    public static void close() {
    	if (sessionFactory != null) {
    		sessionFactory.close();
    	}
    	sessionFactory = null;
    }
}