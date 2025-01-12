package bankemployee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String name;
	private long phone;
	private String address;
	@Autowired
	@Qualifier("sbi")
	BankAccount ac;
	
	public void check() {
		
		ac.balance();
	}
	
}
