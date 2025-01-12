package springs_anotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Product product=context.getBean("product",Product.class);
//		product.description();
		Product product1=context.getBean("product",Product.class);
//		product1.description();
//		System.out.println(product.getAge());
//		System.out.println(product1.getName());
		System.out.println(product);
		System.out.println(product1);
		
		
		
	}
}
