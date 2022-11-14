package business;

import core.logging.ILogger;
import dataAccess.ICourseDao;
import entities.Course;

public class CourseManager {
	private ICourseDao courseDao;
	private ILogger[] loggers;
	
public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers=loggers;
	}


public void add(Course course) throws Exception {
	if(course.getPrice() < 0) {
		throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
	}
	if(course.getName().equals(course.getName())) {
		throw new Exception("Kurs ismi tekrar edemez.");
	}
	
	courseDao.add(course);
	
	for(ILogger logger : loggers) {
		logger.log(course.getName());
	}
}
}
