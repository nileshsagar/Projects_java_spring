package is_a_relationship;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Item{

	public void used() {
		
		System.out.println("riding");
	}
}
