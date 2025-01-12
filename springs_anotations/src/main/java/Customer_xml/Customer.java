package Customer_xml;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component

public class Customer {

	@PreDestroy
  public void shop() {
		
		System.out.println("buy!");
	}
	public void start() {
		
		System.out.println("Go to the Market!");
	}
	public void stop() {
		
		System.out.println("Come Back Home!!");
	}
}
