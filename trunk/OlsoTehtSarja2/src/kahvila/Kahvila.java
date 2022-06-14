package kahvila;

import java.util.ArrayList;

/**
 *
 * @author Johannes Palojärvi
 */
public class Kahvila {

	// Esittele instanssimuuttuja valikoiman ja tilausten tallettamiseksi
	// (ArrayList)
	Valikoima valikoima;
	private ArrayList<Tilaus> tilaukset = new ArrayList<>();

	// Ohjelmoi yhden parametrin konstruktori
	public Kahvila(Valikoima valikoima) {
		this.valikoima = valikoima;
	}

	// Ohjelmoi lisääTilaus()
	public void lisääTilaus(Tilaus tilaus) {
		this.tilaukset.add(tilaus);
	}

	// Ohjelmoi toString(), joka palauttaa merkkijonoesityksen KAhvila-oliosta
	@Override
	public String toString() {
		String returnString = "";
		double tilauksienSumma = 0.0;
		for (int i = 0; i < this.tilaukset.size(); i++) {
			tilauksienSumma += tilaukset.get(i).annaLoppusumma();
			returnString += "\nTilaus " + (i + 1) + ": \n" + this.tilaukset.get(i) + "Kokonaishinta: "
					+ this.tilaukset.get(i).annaLoppusumma() + "€.\n" + "Kaikkien tilauksien loppusumma: "
					+ tilauksienSumma + "€\n";
		}
		return returnString;
	}

}
