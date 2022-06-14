import saikeet.Juoksija;

/**
 * @author Johannes Palojärvi 30.01.2022
 */

public class JuoksijaMain {
	public static void main(String[] args) {

		// Luo ja käynnistä Juoksija-säie
		Juoksija juoksija = new Juoksija();
		juoksija.start();
		juoksija.isJuoksemassa();

		// Odota jonkun aikaa: Thread.sleep()
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Pysäytä säie
		juoksija.lopeta();
		juoksija.isJuoksemassa();

		// Hae ja tulosta juostujen kerrosten määrä
		System.out.println(juoksija.getKierrokset());

	}
}
