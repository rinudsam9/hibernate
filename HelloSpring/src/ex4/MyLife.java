package ex4;

import org.springframework.stereotype.Component;


public class MyLife {

	public MyLife() {
		System.out.println("MyLife constructor");
	}
	
	public void janam(){
		System.out.println("MyLife after birth");
	}
	
	public void maran() {
		System.out.println("MyLife before death");
	}
	

}
