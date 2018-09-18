package lti.ex5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestUser {
	@Test

	public void testCase1() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		User u = new User();
		u.setFirstname("Polo");
		u.setLastname("Mint");
		u.setUsername("polo");
		u.setPassword("polo123");

		Address address = new Address();
		address.setCity("Pune");
		address.setStreet("Dehu");
		address.setZipcode("412101");

		u.setAddress(address);
		address.setUser(u);
		session.save(u);
		tx.commit();

	}

}
