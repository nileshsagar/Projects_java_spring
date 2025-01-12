package is_a_relationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainC {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ItemConfig.class);
		Item item= (Computer)context.getBean("computer");
		item.used();
		Item item2= (Pen) context.getBean("pen");
		item2.used();
		
		System.out.println(((Pen)item2).cost);
		
	 Item item3=context.getBean("bike",Bike.class);
	 item3.used();
		 
	}
}
