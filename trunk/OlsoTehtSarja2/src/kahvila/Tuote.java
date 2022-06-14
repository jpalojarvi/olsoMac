package kahvila;

/*
 *
 * @author Johannes Palojärvi
 */
public class Tuote {

	// Esittele instanssimuuttujat
	private String nimi;
	private double hinta;
	private int tuoteNumero;

	// Esittele staattinen muuttuja seuraavan vapaan tuotenumeron ylläpitämiseksi
	private static int seuraavaVapaaTuoteNumero = 1;

	// Ohjelmoi staattinen metodi alustaSeuraavaVapaaTuotenumero()
	public static void alustaSeuraavaVapaaTuotenumero() {
		seuraavaVapaaTuoteNumero = 1;
	}

	// Ohjelmoi kahden parametrin konstruktori
	public Tuote(String nimi, double hinta) {
		this.tuoteNumero = seuraavaVapaaTuoteNumero;
		this.nimi = nimi;
		this.hinta = hinta;
		seuraavaVapaaTuoteNumero++;
	}

	// Ohjelmoi getNimi()
	public String getNimi() {
		return this.nimi;
	}

	// Ohjelmoi getHinta()
	public double getHinta() {
		return this.hinta;
	}

	// Ohjelmoi getTuotenumero()
	public int getTuotenumero() {
		return this.tuoteNumero;
	}

	// Ohjelmoi toString(), joka palauttaa merkkijonoesityksen Tuote-oliosta.
	@Override
	public String toString() {
		return this.tuoteNumero + ": " + this.nimi + ", " + this.getHinta() + "€.";
	}
}