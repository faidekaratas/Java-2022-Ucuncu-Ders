package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao{
public void add(Instructor instructor) {
	System.out.println("Instructor added to database with JDBC");
	}
}
