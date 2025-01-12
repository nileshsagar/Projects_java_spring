package bankemployee;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HDFC  implements BankAccount
{

	@Override
	public void balance() {
		
		System.out.println("5000.00 rupees");
		
	}
	
	

}
