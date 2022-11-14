package business;

import core.logging.ILogger;
import dataAccess.ICategoryDao;
import entities.Category;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private ILogger[] loggers;

	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		if(category.getName().equals(category.getName())) {
			throw new Exception("Kategori ismi tekrar edemez.");
		}

		categoryDao.add(category);
		
		for(ILogger logger : loggers ) {
			logger.log(category.getName());
		}
	}
}
