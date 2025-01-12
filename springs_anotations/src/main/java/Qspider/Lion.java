package Qspider;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal{

	@Override
	public void sound() {
		
		System.out.println("Lio Sound!");
		
		
	}

}
