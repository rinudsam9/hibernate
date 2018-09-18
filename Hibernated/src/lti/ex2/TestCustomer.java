package lti.ex2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.ex2.Customer;
import lti.util.HibernateUtil;

public class TestCustomer {

	@Test

	public void testAddCustomer() {
		SessionFactory factory = HibernateUtil.getFactory();

		Session session = factory.getCurrentSession();
		Transaction txn = session.getTransaction();

		Customer c1 = new Customer();
		c1.setName("Shri");
		c1.setCreditlimit(110000);

		try {
			txn.begin();
			session.save(c1);
			txn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}

	@Test
	public void testFetchCustomer() {
		SessionFactory factory = HibernateUtil.getFactory();

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Customer c = (Customer) session.get(Customer.class, 2);
		System.out.println(c.getName() + ": Rs " + c.getCreditlimit());
	}

	@Test

	public void testUpdateCustomer() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();

		Customer c = (Customer) session.get(Customer.class, 2);
		c.setCreditlimit(20000);
		txn.commit();
		factory.close();
	}

	@Test
	public void testDetachUpdateCustomer() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();

		Customer c2 = (Customer) session.get(Customer.class, 2);
		c2.setCreditlimit(119999);
		session.update(c2);
		txn.commit();
		factory.close();
	}

	@Test
	public void testDeleteCustomer() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();

		Customer c = (Customer) session.get(Customer.class, 2);
		session.delete(c);
		txn.commit();

		factory.close();
	}

}
