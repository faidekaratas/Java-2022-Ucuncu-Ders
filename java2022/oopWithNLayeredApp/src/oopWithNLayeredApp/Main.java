package oopWithNLayeredApp;

import java.util.List;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.loging.DatabaseLogger;
import oopWithNLayeredApp.core.loging.FileLogger;
import oopWithNLayeredApp.core.loging.MailLogger;
import oopWithNLayeredApp.core.loging.loger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1= new Product(1,"Iphone XR",9000);
		
		loger[] loggers= {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		ProductManager productManager= new ProductManager(new JdbcProductDao(), loggers);
		productManager.add(product1);
	}

}
