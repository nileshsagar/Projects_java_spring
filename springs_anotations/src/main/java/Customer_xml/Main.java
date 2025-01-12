package Customer_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new  AnnotationConfigApplicationContext(config.class);
       Customer customer=(Customer) context.getBean("customer");
       customer.shop();
       customer.start();
       customer.stop();
       ((AbstractApplicationContext) context).close();
		
	}
}
