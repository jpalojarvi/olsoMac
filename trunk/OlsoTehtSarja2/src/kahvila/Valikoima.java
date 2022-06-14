package kahvila;

import java.util.ArrayList;

/**
 *
 * @author Johannes Palojärvi
 */
public class Valikoima {

	// Esittele ArrayList tuotteiden tallettamiseksi
	ArrayList<Tuote> valikoima = new ArrayList<Tuote>();

	// Ohjelmoi getTuote()
	public Tuote getTuote(int tuotenumero) {
//		if (this.valikoima.contains((tuotenumero) - 1)) {
//			return this.valikoima.get((tuotenumero) - 1);
//		}

		for (int i = 0; i < valikoima.size(); i++) {
			if (valikoima.get(i).getTuotenumero() == tuotenumero) {
				return valikoima.get(i);
			}
		}
		return null;
	}

	public Tuote getTuote(String nimi) {
		for (int i = 0; i < this.valikoima.size(); i++) {
			if (valikoima.get(i).getNimi() == nimi) {
				return valikoima.get(i);
			}
		}
		return null;
	}

	// Ohjelmoi lisääTuote()
	public void lisääTuote(Tuote tuote) {
		if (!this.valikoima.contains(tuote)) {
			this.valikoima.add(tuote);
		}

	}

	// Ohjelmoi poistaTuote()
	// Poistettava Tuote-olio pitää etsiä listasta tuotenumerolla,
	// koska poistojen jälkeen tuotenumero != listan indeksi
	public boolean poistaTuote(int tuotenumero) {
		if (this.valikoima.get(tuotenumero) != null) {
			this.valikoima.remove(tuotenumero - 1);
			return true;
		}
		return false;
	}

	// Ohjelmoi toString(), joka on merkkijonoesitys Valikoima-oliosta (eli kaikista
	// tuotteista)
	@Override
	public String toString() {
		String returnString = "";
		for (int i = 0; i < valikoima.size(); i++) {
			returnString += (this.valikoima.get(i) + "\n");
		}
		return returnString;
	}
}
