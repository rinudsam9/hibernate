package lti.ex1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestProduct {

	@Test

	public void testAddProduct() {
		SessionFactory factory = HibernateUtil.getFactory();

		Session session = factory.getCurrentSession();
		Transaction txn = session.getTransaction();

		Product p1 = new Product();
		p1.setName("xiaomi");
		p1.setPrice(12399.99);

		try {
			txn.begin();
			session.save(p1);
			txn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}

	@Test
	public void testFetchProduct() {
		SessionFactory factory = HibernateUtil.getFactory();

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Product p = (Product) session.get(Product.class, 2);
		System.out.println(p.getName() + ": Rs " + p.getPrice());
	}

	@Test

	public void testUpdateProduct() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();

		Product p = (Product) session.get(Product.class, 2);
		p.setPrice(119999);
		txn.commit();
		factory.close();
	}

	@Test
	public void testDeTachUpdateProduct() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();

		Product p2 = (Product) session.get(Product.class, 2);
		p2.setPrice(119999);
		session.update(p2);
		txn.commit();

		factory.close();
	}

	@Test
	public void testDeleteProduct() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();

		Product p = (Product) session.get(Product.class, 2);
		session.delete(p);
		txn.commit();

		factory.close();
	}

}
