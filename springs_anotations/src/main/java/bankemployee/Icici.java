package bankemployee;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Icici implements BankAccount {

	@Override
	public void balance() {
		
		System.out.println("10000.00 rupees");
		
	}

	
}
