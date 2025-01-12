package engineer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(EConig.class);
//		 Engineer engineer=(Engineer) context.getBean("Mech");
		 Engineer engineer1=(Engineer) context.getBean("engineer");
		 engineer1.branch();
		
		
	}
}
