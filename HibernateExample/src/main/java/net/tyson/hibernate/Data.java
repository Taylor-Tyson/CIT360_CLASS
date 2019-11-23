package net.tyson.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Data {
    protected SessionFactory sessionFactory;
 
    protected void setup() {
    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
    	try {
    	    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    	} catch (Exception ex) {
    	    StandardServiceRegistryBuilder.destroy(registry);
    	}
    }
 
    protected void exit() {
    	sessionFactory.close();
    }
 
    protected void create() {
    	Student stud = new Student();
    	stud.setStudent_name("Troy");
    	stud.setStudent_gender("Male");
     
        Session session = sessionFactory.openSession();
        session.beginTransaction();
     
        session.save(stud);
     
        session.getTransaction().commit();
        session.close();
    }
 
    protected void read() {
    	Session session = sessionFactory.openSession();
    	 
        long id = 1;
        Student stud = session.get(Student.class, id);
     
        System.out.println("Student name: " + stud.getStudent_name());
        System.out.println("Student gender: " + stud.getStudent_gender());
     
        session.close();
    
    }
 
    protected void update() {
    	Student stud = new Student();
        stud.setId(4);
        stud.setStudent_name("Baby");
        stud.setStudent_gender("????");
         
        Session session = sessionFactory.openSession();
        session.beginTransaction();
     
        session.update(stud);
     
        session.getTransaction().commit();
        session.close();

    }
 
    protected void delete() {
    	Student stud = new Student();
        stud.setId(5);
     
        Session session = sessionFactory.openSession();
        session.beginTransaction();
     
        session.delete(stud);
     
        session.getTransaction().commit();
        session.close();
    }
 
    public static void main(String[] args) {
        Data data = new Data();
        data.setup();
        data.create();
        data.read();
        data.update();
        data.delete();
        data.exit();
    }
}