package oopWithNLayeredApp.core.loging;

public class DatabaseLogger implements loger{

	@Override
	public void log(String data) {
		System.out.println("Veri tabanına loglandı: "+ data);
		
	}

}
