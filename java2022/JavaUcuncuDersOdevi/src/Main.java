import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import core.logging.MailLogger;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCourseDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		ILogger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		Category category = new Category(1, "Programlama");
		categoryManager.add(category);
		
		CourseManager courseManager=new CourseManager(new JdbcCourseDao(), loggers);
		Course course=new Course(1,"Java",20);
		courseManager.add(course);
		
		InstructorManager instructorManager=new InstructorManager(new JdbcInstructorDao(), loggers);
		Instructor instructor=new Instructor(1,"Faide", "Karataş",10000);
		instructorManager.add(instructor);
	}

}
