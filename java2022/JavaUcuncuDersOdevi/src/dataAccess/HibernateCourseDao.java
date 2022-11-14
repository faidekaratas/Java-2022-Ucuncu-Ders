package dataAccess;

import entities.Course;

public class HibernateCourseDao implements ICourseDao{
public void add(Course course) {
	System.out.println("Course added to database with Hibernate");
	}
}
