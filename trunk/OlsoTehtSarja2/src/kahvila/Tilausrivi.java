package kahvila;

/**
 *
 * @author Johannes Palojärvi
 */
public class Tilausrivi {

	// Esittele instanssimuuttujat
	private int kappalemäärä;
	private int tuotenumero;
	Tuote tilattuTuote;

	// Ohjelmoi kolmen parametrin konstruktori
	public Tilausrivi(Valikoima valikoima, int tuotenumero, int määrä) {
		this.tilattuTuote = valikoima.getTuote(tuotenumero);
		this.tuotenumero = tilattuTuote.getTuotenumero();
		this.kappalemäärä = määrä;
	}

	// Ohjelmoi annaSumma()
	public double annaSumma() {
		double summa = 0.00;
		summa += tilattuTuote.getHinta() * kappalemäärä;
		return summa;
	}

	// Ohjelmoi toString(), joka palautta merkkijonoesityksen Tilausrivi-oliosta
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tuotenumero " + this.tuotenumero + ": " + tilattuTuote.getNimi() + ", " + this.kappalemäärä + "kpl, à "
				+ this.tilattuTuote.getHinta() + "€";
	}
}
