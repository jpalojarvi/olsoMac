package pokerikadet;

/**
 *
 * @author Johannes Palojärvi 11.01.2022
 */
public class Kortti {
	final static String[] MAAT = { "Hertta", "Ruutu", "Risti", "Pata" };
	final static int HERTTA = 0, RUUTU = 1, RISTI = 2, PATA = 3;
	// Ylläolevien näkyvyys: pakkauksen sis�ll� (ei private, ei public)
	// Viittaus muista luokista muodossa Luokka.tunnus, esim. Kortti.HERTTA

	// Esittele instanssimuuttujat kortin maan ja arvon tallettamiseksi
	private int arvo;
	private int maa;

	// Kirjoita kahden parametrin konstruktori
	public Kortti(int maa, int arvo) {
		this.maa = maa;
		this.arvo = arvo;
	}

	// Kirjoita getterit
	public int getArvo() {
		return arvo;
	}

	public int getMaa() {
		return maa;
	}

	// Kirjoita toString()
	@Override
	public String toString() {
		return MAAT[maa] + " " + arvo;
	}
}
