import kahvila.Kahvila;
import kahvila.Tilaus;
import kahvila.Tilausrivi;
import kahvila.Tuote;
import kahvila.Valikoima;

/**
 *
 * @author Laita tähän oma nimesi ja päiväys
 */

public class Main {

	public static void main(String[] args) {

		// Esittele tarvittavat muuttujat.
		Valikoima valikoima = new Valikoima();
		Kahvila kahvila = new Kahvila(valikoima);

		// Luo kolme tuotetta.
		Tuote banaani = new Tuote("Banaani", 0.45);
		Tuote mansikkaleivos = new Tuote("Mansikkaleivos", 3.5);
		Tuote pieniKahvi = new Tuote("Pieni kahvi", 1);

		// Lisää ne valikoimaan.
		System.out.println("Lisätään tuotteita valikoimaan:");
		valikoima.lisääTuote(banaani);
		valikoima.lisääTuote(mansikkaleivos);
		valikoima.lisääTuote(pieniKahvi);

		// Tulosta valikoima.
		System.out.println(valikoima);

		// Poista siitä yksi tuote.
		System.out.println("Poistetaan banaani valikoimasta:");
		valikoima.poistaTuote(1);

		// Tulosta muuttunut valikoima.
		System.out.println(valikoima);

		// Luo tilaus.
		System.out.println("Luodaan tilaus 1.");
		Tilaus tilaus = new Tilaus();

		// Luo kaksi tilausriviä.
		Tilausrivi rivi1 = new Tilausrivi(valikoima, 2, 2);
		Tilausrivi rivi2 = new Tilausrivi(valikoima, 3, 2);

		// Lisää tilausrivit tilaukseen.
		tilaus.lisääRivi(rivi1);
		tilaus.lisääRivi(rivi2);

		// Lisää tilaus kahvilan tilauslistaan.
		kahvila.lisääTilaus(tilaus);

		// Luo toinenkin tilaus tilausriveineen.
		System.out.println("Luodaan tilaus 2.");
		Tilaus tilaus2 = new Tilaus();
		Tilausrivi rivi3 = new Tilausrivi(valikoima, 2, 4);
		Tilausrivi rivi4 = new Tilausrivi(valikoima, 3, 4);
		tilaus2.lisääRivi(rivi3);
		tilaus2.lisääRivi(rivi4);
		kahvila.lisääTilaus(tilaus2);

		// Tulosta kaikki kahvilan tilaukset.
		System.out.println("\nTulostetaan kahvilan tilaukset:");
		System.out.println(kahvila);

	}
}
