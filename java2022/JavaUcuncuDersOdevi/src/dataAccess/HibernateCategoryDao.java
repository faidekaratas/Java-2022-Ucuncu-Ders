package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements ICategoryDao{
public void add(Category category) {
		System.out.println("Category added to database with Hibernate");
	}
}
