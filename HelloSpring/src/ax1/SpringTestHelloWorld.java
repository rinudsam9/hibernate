package ax1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:annotated.xml"})
public class SpringTestHelloWorld {
	
	/*@Autowired
	private ApplicationContext ctx;*/
	
	@Autowired
	private HelloWorld hw;
	
	@Test
	public void testCase() {
		/*ApplicationContext ctx = new 
					ClassPathXmlApplicationContext("annotated.xml");*/
		
	/*	HelloWorld hw = (HelloWorld) ctx.getBean("hi");*/
		System.out.println(hw.getName());
		
		
		
		
	}
}
