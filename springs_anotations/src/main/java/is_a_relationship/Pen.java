package is_a_relationship;

import org.springframework.stereotype.Component;

@Component
public abstract class Pen implements Item{

	double cost;
	
	public void used() {
		System.out.println("Hello");
	}
}
