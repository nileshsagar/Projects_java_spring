package engineer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engineer {

	@Value("Nilesh")
	private String name;
	@Value("Pune")
	private String address;
	@Value("8765435675")
	private long phone;
	@Autowired
	@Qualifier("mech")
	Collage c;

	public void branch() {

		c.Study();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Collage getC() {
		return c;
	}

	public void setC(Collage c) {
		this.c = c;
	}

}
