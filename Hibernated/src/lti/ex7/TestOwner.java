package lti.ex7;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestOwner {
	@Test
	public void testCase1() {
		SessionFactory factory=HibernateUtil.getFactory();
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		Owner own=new Owner();
		own.setPancard(10);
		own.setName("Rinu");
		
		session.save(own);
		tx.commit();
}
	@Test
	public void testCase2() {
		
		SessionFactory factory=HibernateUtil.getFactory();
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		Owner owns=(Owner)session.get(Owner.class,10);
		Estate est=new Estate();
		est.setNumber(12);
		est.setEstatename("Central Park");
		est.setOwn(owns);
		session.save(est);
		tx.commit();
}
}
