import java.util.Scanner;

/**
 * @author Johannes Palojärvi 27.1.2022
 */

public class Poikkeus {

	public static void main(String[] args) {

		System.out.println("Tehtävä 1: Poikkeuksen testaaminen");

		// Esittele tarvittavat muuttujat
		Scanner input = new Scanner(System.in);
		String syöte = null;
		int ikä;

		// Poikkeustilanteessa ikää on kysyttävä vielä uudelleen,
		// joten tarvitset kaiken ympärille vielä toistorakenteen
		while (true) {
			// Ohjelmoi try-catch-lohko
			try {
				// Kysy ikä ja lue se merkkijonomuuttujaan
				System.out.println("Anna ikäsi.");
				syöte = input.nextLine();
				// Tee muunnos
				ikä = Integer.parseInt(syöte);
				// - jos muunnos onnistuu, näytä tulos ja lopeta
				System.out.println("Vuoden päästä olet jo " + (ikä + 1) + "-vuotias.");
				// - jos syntyy poikkeus, anna virheilmoitus
			} catch (Exception e) {
				System.out.println("Antamasi ikä " + syöte + " ei ole kelvollinen.");
			}
		}

	}
}
