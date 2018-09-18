package lti.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


	public final class HibernateUtil {
		private HibernateUtil() {
			
		}
			
		
		// TODO Auto-generated constructor stub
	
public static SessionFactory getFactory() {
	Configuration config = new Configuration().configure();
	return config.buildSessionFactory();
	
}			
}

