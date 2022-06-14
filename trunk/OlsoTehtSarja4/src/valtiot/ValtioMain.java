package valtiot;

import java.io.IOException;

/**
* @author laita tähän nimesi ja päiväys
*/

import java.util.HashMap;
import java.util.Scanner;

public class ValtioMain {

	public static void main(String[] args) throws IOException {

		// Valtioiden käsittelyssä tarvittavat muuttujat ja
		// HashMap-olio Valtio-olioiden tallentamiseksi
		Valtio valtio;
		String nimi;
		String pääkaupunki;
		int asukasluku;
		HashMap<String, Valtio> valtiot = new HashMap<>();
		final String TIEDOSTONIMI = "C:\\OlsoProjektit\\valtiot.dat";
		Scanner näppis = new Scanner(System.in);

		/*
		 * Jos tiedosto on olemassa, lue HashMap sieltä valtiot =
		 * TiedostonKäsittely.lueTiedosto(TIEDOSTONIMI); if (valtiot == null) { valtiot
		 * = new HashMap<>(); }
		 */

		// Lue valtioiden tietoja ja lisää valtioita HashMapiin,
		// kunnes syötteenä annetaan tyhjä
		String annettuNimi;
		do {
			System.out.println("Anna valtion nimi: ");
			annettuNimi = näppis.nextLine();
			if (annettuNimi.length() == 0) {
				break;
			}
			System.out.println("Anna valtion pääkaupungin nimi: ");
			pääkaupunki = näppis.nextLine();
			System.out.println("Anna valtion asukasluku: ");
			asukasluku = Integer.parseInt(näppis.nextLine().toString());
			valtiot.put(annettuNimi, new Valtio(annettuNimi, pääkaupunki, asukasluku));

		} while (annettuNimi.length() != 0);

		// Tulosta HashMapin sisältö, käytä for-each- rakennetta
		System.out.println("HashMapissa nyt seuraavat valtiot:");
		// for (Map.Entry<String, Valtio> entry : valtiot.entrySet()) {
		for (Object rivi : valtiot.values()) {
			System.out.println(rivi);
		}

		// Kirjoita HashMap tiedostoon
		TiedostonKasittely.kirjoitaTiedosto(TIEDOSTONIMI, valtiot);

		näppis.close();
	}
}
