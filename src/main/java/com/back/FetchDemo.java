package com.back;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class FetchDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student std = (Student)session.load(Student.class, 1);
		Student std1 = (Student)session.get(Student.class, 1);
		System.out.print(std);
		
		session.close();
		factory.close();
	}

}
