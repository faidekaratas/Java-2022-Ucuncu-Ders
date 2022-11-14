package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements ICategoryDao{
public void add(Category category) {
	System.out.println("Category added to database with JDBC");
	}
}
