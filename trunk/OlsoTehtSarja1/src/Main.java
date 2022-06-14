import pokerikadet.Kasi;
import pokerikadet.Pakka;
 
/**
 * 
 * @author Johannes Palojärvi 11.01.2022
 */

public class Main {

	public static void main(String[] args) {

		// Luo pakka
		Pakka pakka = new Pakka();

		// Sekoita pakka
		pakka.sekoita();

		// Jaa käsi
		Kasi kasi = new Kasi(pakka);

		// Näytä (tulosta) käsi
		System.out.println(kasi);

		// Tarkasta onko väri
		System.out.println(kasi.annaArvo());

		pakka.sekoita();

		System.out.println(pakka);

		System.out.println(kasi.annaArvo());

		System.out.println("--- PakkaTest: sekoita");
		Pakka pakka2 = new Pakka();
		pakka2.sekoita();
		System.out.println("Kortit sekoitettuna:");
		for (int i = 1; i <= 51; i++) {
			System.out.println(i + ": " + pakka2.annaKortti());
		}

		Kasi kasi2 = new Kasi(pakka2);

		System.out.println(kasi2);
		System.out.println(kasi2.annaArvo());

		int arvo = 0;
		int counter = 0;
		while (arvo == 0) {
			System.out.println(counter);
			Pakka pakka3 = new Pakka();
			Kasi kasi3 = new Kasi(pakka3);
			System.out.println(kasi3);
			arvo = kasi3.annaArvo();
			counter++;
		}
	}
}