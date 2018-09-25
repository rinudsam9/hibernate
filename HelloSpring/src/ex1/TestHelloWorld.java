package ex1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestHelloWorld {

	@Test

	public void testGreeting() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex1/appctx.xml");
		HelloWorld hw = (HelloWorld) appCtx.getBean("hello");
		System.out.println(hw.getGreeting());
	}
}
