package com.hql;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;

import com.back.Person;

public class HqlDemo {
	public static void main(String[]args) throws IOException {
		System.out.print("Connection Started...");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		
//		String query = "from Person";
//		String query = "from Person where name ='Jawad'";
//		String selectQuery = "from Person where name=:x and age=20 and id=:n"; // SELECT QUERY
//		Query q = s.createQuery(selectQuery);
//		q.setParameter("x","Jawad");
//		q.setParameter("n", 123);
//		
		
		//TRANSACTION NEEDED FOR DELETE
//		Transaction tx = s.beginTransaction();
//		String deleteQuery = "delete from Person where name=:x "; //DELETE QUERY
//		Query q2 = s.createQuery(deleteQuery);
//		q2.setParameter("x","Jawad");
//		int result = q2.executeUpdate();
		
		//TRANSACTION NEEDED FOR UPDATE ALSO
//		String updateQuery = "Update Person set age=:a where name=:x "; //UPDATE QUERY
//		Query q3 = s.createQuery(updateQuery);
//		q3.setParameter("x","Jawad");
//		q3.setParameter("a", 123);
//		int r2 = q3.executeUpdate();
//		//Single (Unique)
		
		
		//JOINS QUERY
		String joinQuery = "select p.age,p.name,a.type from Person as p INNER JOIN p.accs as a"; //JOIN QUERY
		Query q4 = s.createQuery(joinQuery);
//		//PAGINATION
//		q4.setFirstResult(0); //START FROM WHICH INDEX
//		q4.setMaxResults(5); //HOW MANY INDEXES WE WANT TO FETCH
		List<Object []> obj = q4.getResultList();
		for(Object[] arr:obj) {
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		//Multiple-list
//		List<Person> list = q.list();
//		for(Person pr:list) {
//			System.out.print(pr.getAge()+" "+pr.getName());
//		}
		
//		tx.commit();
		s.close();
		factory.close();
		
	}
}
