package ex2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageService {
	
	@Test
	public void testProvider() {
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex2/appctx.xml");
		MessageProvider mp = (MessageProvider) appCtx.getBean("provider");
		mp.process("sms", "9421408668", "Hello Rinu");
		mp.process("email", "rinudsam9@gmail.com", "Hello Rinu");
		mp.process("wapp", "abhi", "Kidh hai?");
	}

}
