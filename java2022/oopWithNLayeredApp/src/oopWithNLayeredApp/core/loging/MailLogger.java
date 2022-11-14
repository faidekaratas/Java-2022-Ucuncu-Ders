package oopWithNLayeredApp.core.loging;

public class MailLogger implements loger{

	@Override
	public void log(String data) {
		System.out.println("Mail gönderildi: "+ data);
		
	}

}
