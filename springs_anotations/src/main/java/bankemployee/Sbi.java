package bankemployee;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Sbi  implements BankAccount{

	

	@Override
	public void balance() {
		System.out.println("3000 rupees");
		
	}
}
