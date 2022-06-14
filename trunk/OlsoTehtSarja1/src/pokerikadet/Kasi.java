package pokerikadet;

import java.util.Arrays;

/**
*
* @author Johannes Palojärvi 11.01.2022
*/

public class Kasi {

	final static int EIVÄRI = 0, EISUORA = 0, SUORA = 1, VÄRI = 2, VÄRISUORA = 3;
	// Näiden näkyvyys: pakkauksen sisällä (ei private, ei public)
	// Viittaus muista luokista muodossa Luokka.tunnus esim. Käsi.SUORA

	// Esittele instanssimuuttujat
	private static Kortti[] kasi = new Kortti[5];
	private static Pakka pakka = new Pakka();

	// Kirjoita konstruktori, joka saa parametrina Pakka-olion
	public Kasi(Kortti[] pakka) {
		for (int i = 0; i < 5; i++) {
			this.kasi[i] = Pakka.annaKortti();
		}
	}

	public Kasi(Pakka pakka) {
		for (int i = 0; i < 5; i++) {
			this.kasi[i] = pakka.annaKortti();
		}
	}

	// Kirjoita toteutus metodille annaArvo()
	public int annaArvo() {
		for (int i = 0; i < this.kasi.length; i++) {
			int vari = this.kasi[0].getMaa();
			if (this.kasi[i].getMaa() != vari) {
				return 0;
			}
		}
		return 2;
	}

	// Kirjoita toString()
	@Override
	public String toString() {
		return Arrays.toString(kasi).replace("[", "").replace("]", "");
	}
}
