package is_a_relationship;

import org.springframework.stereotype.Component;

@Component
public class Computer implements Item {

	public void used() {
		
		System.out.println("used for codiing");
	}
	
}
