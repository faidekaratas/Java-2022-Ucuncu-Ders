package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.loging.loger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private loger[] loggers; // list<loger> loggers==loger[] loggers

	public ProductManager(ProductDao productDao, loger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception 
	// metod çağırıldığında throw exc hatası fırlatılabilir anlamına gelir.
	{
		// business rules : iş kuralları buraya yazılır.
		if (product.getUnitPrice() < 10) {
			// throw hata fırlatır.
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}
		productDao.add(product);
		for (loger loger : loggers) {
			loger.log(product.getName());
		}
	}
}
