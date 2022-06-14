package kahvila;

import java.util.ArrayList;

/**
 *
 * @author Johannes Palojärvi
 */
public class Tilaus {

	// Esittele ArrayList tilausrivien tallettamiseksi
	private ArrayList<Tilausrivi> tilausrivit = new ArrayList<>();

	// Ohjelmoi lisääRivi()
	public void lisääRivi(Tilausrivi tilausrivi) {
		this.tilausrivit.add(tilausrivi);
	}

	// Ohjelmoi annaLoppusumma()
	public double annaLoppusumma() {
		double loppuSumma = 0.00;
		for (int i = 0; i < tilausrivit.size(); i++) {
			loppuSumma += this.tilausrivit.get(i).annaSumma();
		}
		return loppuSumma;
	}

	// Ohjelmoi toString, joka palauttaa merkkijonoesityksen yhdestä Tilaus-oliosta
	@Override
	public String toString() {
		String returnString = "";
		for (int i = 0; i < this.tilausrivit.size(); i++) {
			returnString += tilausrivit.get(i) + "\n";
		}
		return returnString;
	}

}
