package com.back;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.net.Answer;
import com.net.Question;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Connection Started..." );
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//        SessionFactory factory = cfg.buildSessionFactory();
        
//        Student st = new Student(1,"MoiZ","Kashmore");
//        st.setId(2);
//        st.setName("Sheeraz");
//        st.setCity("Badani");
//        System.out.print(st);

//        Address ad = new Address();
//        ad.setPostalCode(79330);
//        ad.setAddress("Home");
//        System.out.print(ad);
//        st.setAddress(ad);
        
//        Person p = new Person(1,"moiz");
//        p.setAge(22);
//        p.setName("MoiZ");
//        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();
//        session.save(st);
////        session.save(p);
//        tx.commit();
//        session.close();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////// 
//        Configuration cf = new Configuration();
//        cf.configure("hibernate.cfg.xml");
//        SessionFactory sf = cf.buildSessionFactory();
//        
//        
//        Question q = new Question();
//        q.setId(1);
//        q.setQuestion("This is a question?");
//        
//        Answer a = new Answer();
//        a.setAnswer("This is an answer.");
//        a.setId(1);
//        
//        q.setAnswer(a);
//        a.setQuestion(q);
//        
//        Session s = sf.openSession();
//        Transaction t = s.beginTransaction();
//        s.save(q);
//        s.save(a);
//               
//        t.commit();
//        s.close();
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        
        Configuration cf = new Configuration();
        cf.configure("hibernate.cfg.xml");
        SessionFactory sf = cf.buildSessionFactory();
        
        Person p = new Person();
        p.setAge(20);
        p.setName("Jawad");
        
        Account acc = new Account();
        acc.setId(1);
        acc.setType("Current");
        acc.setPerson(p);
        
        Account acc2 = new Account();
        acc2.setId(2);
        acc2.setType("Saving");
        acc2.setPerson(p);
        List<Account>  a = new ArrayList<Account>();
        a.add(acc);
        a.add(acc2);
        p.setAccs(a);
        
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
//        s.save(p);
//        s.save(acc);
//        s.save(acc2);
        Person pg = (Person)s.get(Person.class,20);
        System.out.println(pg.getName());
        
        for(Account as:pg.getAccs()) {
        	System.out.println(as.getType());
        }
        t.commit();
        
        s.close();
    }
    
}
