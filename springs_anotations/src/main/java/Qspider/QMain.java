package Qspider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QMain {

	public static void main(String[] args) {
	
		ApplicationContext context=new AnnotationConfigApplicationContext(Qconfig.class);
		Zoo zoo= (Zoo) context.getBean("zoo");
		
		
	}
}
