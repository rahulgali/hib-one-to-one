package com.siri.hibernate.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.siri.hibernate.sessionfactory.HibernateSession;

import com.siri.hibernate.model.User;
import com.siri.hibernate.model.Vehicle;

public class Test {
	static SessionFactory factory = null;
	
	public static void main(String[] args) {
		
		
		factory = HibernateSession.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		System.out.println("September 25");
		
		Vehicle vehicle = new Vehicle();
		//vehicle.setVehicleId(25);
		vehicle.setVehicleName("September 25");
		
		
//		System.out.println("vehicle inserted");
//		System.out.println("Begin of session");
		User user = new User();
		user.setUserName("Rahul");
		user.setVehicle(vehicle);
		
		System.out.println("vehicle set");
		//user.setVehicle(vehicle);
		//vehicle.setVehicleId(vehicleId);
		
		session.save(user);
		System.out.println("user set");
		
		
		session.getTransaction().commit();
		System.out.println(user);
		
		
	
		/*PersonDetails alexDetails = new PersonDetails();
		alexDetails.setPersonJob("Engineer");
		alexDetails.setPersonSalary("5000");
		
	
		Persons alex = new Persons();
		alex.setPersonName("Alexander brahandam");
		alex.setPd(alexDetails);
		
		session.save(alex);
		session.save(alexDetails);
		session.getTransaction().commit();
		//session.close();
*/		
		
		/*
		System.out.println("Test3");
		alex.setpDetail(alexDetails);
		
		System.out.println("Test4");
		//session.save(alexDetails);
		System.out.println("Test5");
		//transaction.commit();
		session.save(alex);
		
		*/
		
		System.out.println("End of session");
		

	}

}
