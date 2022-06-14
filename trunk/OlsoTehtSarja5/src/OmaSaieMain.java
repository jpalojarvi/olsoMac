import saikeet.OmaSaie;

/**
 * @author Johannes Palojärvi 30.01.2022
 */

public class OmaSaieMain {

	// Säiettä testaava pääohjelma
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Säiepääohjelma");

		// Luo OmaSaie alkuarvolla 15
		OmaSaie saie = new OmaSaie(15);
		
		// Tulosta alkuarvot
		System.out.println("Alkuarvot ovat " + saie.getLuku() + ", " + OmaSaie.getYhteisetAjokerrat());
		
		// Käynnistä säie ja odota sen päättymistä
//		saie.run();
		saie.start();
		saie.join();

		// Tulosta uudet arvot
		System.out.println("Uudet arvot ovat " + saie.getLuku() + ", " + OmaSaie.getYhteisetAjokerrat());

		// Luo uusi OmaSaie alkuarvolla 2021
		saie = new OmaSaie(2021);
		
		// Tulosta alkuarvot
		System.out.println("Alkuarvot ovat " + saie.getLuku() + ", " + OmaSaie.getYhteisetAjokerrat());

		// Käynnistä säie ja odota sen päättymistä
//		saie.run();
		saie.start();
		saie.join();

		// Tulosta uudet arvot
		System.out.println("Uudet arvot ovat " + saie.getLuku() + ", " + OmaSaie.getYhteisetAjokerrat());

		// "Suorituta säiettäsi ja totea ero instanssimuuttujan ja luokkamuuttujan käsittelyssä. Mikä ero niillä on?"
		// V: Instanssimuuttuja (luku) resetoituu luodessa säie uuelleen, luokkamuuttuja pysyy muistissa..?
	}

}
