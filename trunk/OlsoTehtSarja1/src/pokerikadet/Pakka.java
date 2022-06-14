package pokerikadet;

import java.util.Random;

/**
 *
 * @author Johannes Palojärvi 11.01.2022
 */
public class Pakka {

	final static int KORTTILKM = 52;
	// Näiden näkyvyys: pakkauksen sisällä (ei private, ei public)
	// Viittaus muista luokista Luokka.tunnus, esim. Pakka.KORTTILKM

	// Esittele instanssimuuttujat
	private static Kortti[] pakka;
	private static int vuorossa = 0;
	Random r = new Random();

	// Kirjoita konstruktori, joka alustaa pakan Kortti-olioilla
	public Pakka() {
		pakka = new Kortti[KORTTILKM];
		int i = 0;

		for (int maa = Kortti.HERTTA; maa <= Kortti.PATA; maa++) {
			for (int arvo = 1; arvo <= 13; arvo++) {
				pakka[i++] = new Kortti(maa, arvo);
			}
		}
	}

	// Kirjoita metodi sekoita()
	public void sekoita() {
		for (int i = 0; i < 100; i++) {
			int kortti1 = r.nextInt(52 - 1) + 1;
			int kortti2 = r.nextInt(52 - 1) + 1;
			Kortti tempKortti = pakka[kortti1];
			pakka[kortti1] = pakka[kortti2];
			pakka[kortti2] = tempKortti;
		}

	}

	// Kirjoita metodi annaKortti()
	public static Kortti annaKortti() {
		int korttiNumero = vuorossa;
		if (vuorossa < 51) {
			vuorossa++;
		} else {
			vuorossa = 1;
		}

		return pakka[korttiNumero];
	}

}
