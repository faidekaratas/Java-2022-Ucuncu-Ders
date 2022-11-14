package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{
	public void add(Instructor instructor) {
		System.out.println("Instructor added to database with Hibernate");
	}
}
