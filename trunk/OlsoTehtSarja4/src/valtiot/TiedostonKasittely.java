package valtiot;

import java.io.BufferedWriter;

/**
* @author Johannes Palojärvi 27.1.2022
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class TiedostonKasittely {

	// Kirjoittaa tiedostoon yhden HashMap-olio, jossa Valtio-olioita
	public static void kirjoitaTiedosto(String tiedostoNimi, HashMap<String, Valtio> valtiot) {

		// Avaa FileOutputStream-tulostusvirta tiedostoon ja
		// Luo objektivirta tiedostoon kirjoittamista varten

//		try (FileOutputStream virta = null; ObjectOutputStream valtioTiedosto = null;) {

		// Kirjoita HashMap objektivirtaan
//		File file = new File(tiedostoNimi);
		BufferedWriter out = null;

		try {
			FileWriter fstream = new FileWriter(tiedostoNimi, true); // true tells to append data.
			out = new BufferedWriter(fstream);
			out.write(valtiot.toString());
			System.out.println("Tiedot tallennettu (HashMap) tiedostoon " + tiedostoNimi);
		}

		catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}

		finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

//	}catch(
//
//	Exception ex)
//	{
//		System.out.println(tiedostoNimi + "-tiedostoon tallentaminen ei onnistunut");
//	}
//	// try-with-resources sulkee lopuksi resurssit automaattisesti
//	}

	/*
	 * Lukee tiedostosta HashMap-olion, jossa Valtio-olioita Palauttaa HashMapin tai
	 * null, jos listaa ei pystytä muodostamaan
	 */
	@SuppressWarnings("unchecked")
	public static HashMap<String, Valtio> lueTiedosto(String tiedostoNimi) {
		HashMap<String, Valtio> valtiot = null;

		// Avaa FileInputStream-lukuvirta tiedostoon ja
		// Luo objektivirta tiedostosta lukemista varten
		try (FileInputStream virta = null; ObjectInputStream valtioTiedosto = null;) {

			// Lue tiedoston sisältö
			valtiot = lueTiedosto(tiedostoNimi);

			System.out.println("Tiedot haettu tiedostosta " + tiedostoNimi);
		} catch (FileNotFoundException ex) {
			System.out.println("Tiedostoa " + tiedostoNimi + " ei ole olemassa.");
		} catch (Exception ex) {
			System.out.println(tiedostoNimi + "-tiedostosta (HashMap) lukeminen ei onnistunut.");
		}

		return valtiot;
	}

}
