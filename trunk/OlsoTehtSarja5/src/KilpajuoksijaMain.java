import saikeet.Kilpajuoksija;

public class KilpajuoksijaMain {

	public static void main(String[] args) {
		// Kopioitu Juoksija.javasta, mahtaako tällä olla mitään merkitystä kun testit meni läpi ja tulostuu oikein?
		
		// Luo ja käynnistä Kilpajuoksija-säie
		Kilpajuoksija kilpaJuoksija  = new Kilpajuoksija();
		kilpaJuoksija.start();

		// Pysäytä säie
//		kilpaJuoksija.stop();

		// Hae ja tulosta juoksijan status
		System.out.println(kilpaJuoksija);


	}

}
