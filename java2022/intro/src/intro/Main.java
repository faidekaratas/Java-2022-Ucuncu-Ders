package intro;

// main javada başlangıç metodudur.
public class Main {
        
	public static void main(String[] args) {
		
		// javada değişken isimleri camelCase olarak yazılır.
		System.out.println("HELLO WORLD!");
		String ortaMetin= "İlginizi Çekebilir";
		String altMetin="Vade Süresi";
		
		System.out.println(ortaMetin);
		
		int vade=12;
		double dolarDun=18.14;
		double dolarBugun=18.10;
		
		boolean dolarDustuMu= false;
		
		String okYonu="";
		if (dolarBugun<dolarDun) {
			okYonu="down.svg";
			System.out.println(okYonu);
		} 
		else if(dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);
		}

		//java da array => String[] olarak gösterilir.
		String[] krediler= {"Hızlı kredi","Maaşını Halkbanktan", "Mutlu Emekli"};
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
