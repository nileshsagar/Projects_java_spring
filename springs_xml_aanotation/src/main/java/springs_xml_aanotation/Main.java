package springs_xml_aanotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import school.School;

public class Main {

	
	public static void main(String[] args) {
		
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("myperson.xml");
//		springs_xml_aanotatio.Person person=(springs_xml_aanotatio.Person) context.getBean("person");
//		person.talk();
//		Person person2=(Person) context.getBean("person");
//       	person2.walk();
////		System.out.println(person.getName());
////		System.out.println(person.getAge() );
//		
		ApplicationContext context=new ClassPathXmlApplicationContext("school.xml");
		
	   School school=(School) context.getBean("school");
        school.teach();
	   
		
		
	}
}
