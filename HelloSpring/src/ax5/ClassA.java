package ax5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ClassA {

	@Autowired
	@Lazy     // due to this injection only constructor classB will be called
	private ClassB classB;
	public ClassA() {
		System.out.println("Constructor of classA");
	}
	
	public void someMethod()
	{
		classB.someOtherMethod();
	}
}
