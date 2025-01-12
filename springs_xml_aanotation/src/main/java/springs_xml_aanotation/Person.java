package springs_xml_aanotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value("Nilesh")
	private String name;
	@Value("19")
    private	int age;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void walk() {
		
		System.out.println("Can I Walk? yes! you can Walk ");
		
	}
}
