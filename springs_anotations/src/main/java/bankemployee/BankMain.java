package bankemployee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Bconig.class);
		Employee employee= (Employee) context.getBean("employee");
		employee.check();
	}
}
