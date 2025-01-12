package springs_hibernate_xml.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import springs_hibernate_xml.dto.Person;

public class PersonDao {

	public EntityManager getEntityManager() {
		
		return Persistence.createEntityManagerFactory("latur").createEntityManager();
		
				
	}
	public void savePerson(Person person ) {
		
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(person);
		transaction.commit();
		
		
		
		
	}
	
}
