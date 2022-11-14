package oopWithNLayeredApp.core.loging;

public class FileLogger implements loger{

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı: "+ data);
		
	}

}
