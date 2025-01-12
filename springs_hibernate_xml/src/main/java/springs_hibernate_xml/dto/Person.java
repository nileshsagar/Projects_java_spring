package springs_hibernate_xml.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int id;
	private String name;
	private long phone;
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	PanCard card;

	public Person(int id, String name, long phone, String address, PanCard card) {
		
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.card = card;
	} 
	
	
	
	
	
}
