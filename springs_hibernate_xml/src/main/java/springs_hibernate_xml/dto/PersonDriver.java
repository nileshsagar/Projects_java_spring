package springs_hibernate_xml.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springs_hibernate_xml.dao.PersonDao;



public class PersonDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("MyPerson.xml");
		 Person person=(Person) context.getBean("c");
		

		 PersonDao dao = (PersonDao) context.getBean("dao");
		 
		 dao.savePerson(person);
		
		
		
		
		
	}
	
	
}
