package lti.ex3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TextBook {

	@Test

	public void testSaveBook() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();
		Book alc = new Book(345254, "The Alchemist", "Paulo Coehlo", 350);
		session.save(alc);
		txn.commit();

	}

	@Test

	public void testGetByBook() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();
		Book bk = (Book) session.bySimpleNaturalId(Book.class).load(345254);
		System.out.println(bk);

	}

	@Test

	public void testGetByIsbn() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();
		Book bk = (Book) session.bySimpleNaturalId(Book.class).load(345254);
		System.out.println(bk);

	}

}
