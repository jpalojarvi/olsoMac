package readerwriter;

/**
 * @author Johannes Palojärvi 01.02.2022
 */

public class LukijaKirjoittajaMain {
	public static void main(String[] args) throws InterruptedException {
//		IntSailio sailio = new IntSailio();
//
//		Kirjoittaja kirjoittaja = new Kirjoittaja(sailio);
//		Lukija lukija = new Lukija(sailio);
//
//		kirjoittaja.start();
//		lukija.start();
//		
//		// Kokeile ensin kuinka sujuu yhdellä kirjoittajalla ja yhdellä lukijalla
//		
//	   kirjoittaja.join();
//	   System.out.println("Kirjoittaja lopetti");
//	  
//	   lukija.join();
//	   System.out.println("Lukija lopetti");

	   
	   
		// Luo sitten vielä kaksi uutta lukijaa, eli kokeile tilannetta,
		// jossa on yksi kirjoittajasäie ja kolme lukijasäiettä
		IntSailio sailio2 = new IntSailio();

		Kirjoittaja kirjoittaja2 = new Kirjoittaja(sailio2);
		Lukija lukija1 = new Lukija(sailio2);
		Lukija lukija2 = new Lukija(sailio2);
		Lukija lukija3 = new Lukija(sailio2);

		kirjoittaja2.start();
		lukija1.start();
		lukija2.start();
		lukija3.start();
		
		kirjoittaja2.join();
		System.out.println("Kirjoittaja 2 lopetti");

		lukija1.join();
		System.out.println("Lukija 1 lopetti");

		lukija2.join();
		System.out.println("Lukija 2 lopetti");

		lukija3.join();
		System.out.println("Lukija 3 lopetti");

	}
}
