package com.slk.HibernateEmployee;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.slk.HibernateEmployee.entities.Department;
import com.slk.HibernateEmployee.entities.Employee;
import com.slk.HibernateEmployee.entities.Location;


public class App 
{
    public static void main( String[] args )
    {
        int a=0;
    	Location l1=new Location();
    	Department d1=new Department();
    	Employee e1=new Employee();
    	
    	List<Location> locations=new ArrayList<Location>();
    	List<Department> departments=new ArrayList<Department>();
    	l1.setLcode(1);
    	l1.setLname("Bangalore");
   
    	System.out.println("\n"+ ++a +"\n");
    	
    	d1.setDno(11);
    	d1.setDname("Marketing");
    	
    	System.out.println("\n"+ ++a +"\n");
    	
    	e1.setEid(111);
    	e1.setEname("Santosh");
    	
    	locations.add(l1);
    	departments.add(d1);
    	
    	System.out.println("\n"+ ++a +"\n");
    	
    	d1.setLocation(locations);
    	e1.setDepartment(departments);
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Location.class).addAnnotatedClass(Department.class).addAnnotatedClass(Employee.class);
    	System.out.println("\n"+ ++a +"\n");
    	SessionFactory s1=con.buildSessionFactory();
    	Session session1=s1.openSession();
    	System.out.println("\n"+ ++a +"\n");
    	//create transactionS
    	session1.beginTransaction();
    	session1.save(e1);
    	session1.save(d1);
    	System.out.println("\n"+ ++a +"\n");
    	session1.save(l1);
    	
    	//end the transaction
    	session1.getTransaction().commit();
    	session1.clear();
    	//close the session
    	session1.close();
    }
}
