
import saikeet.Kilpajuoksija;

/**
* @author Johannes Palojärvi 30.01.2022
*/

public class KilpailuMain {

	private static int KILPAILIJALKM = 8;
	
	public static void main(String[] args) {
		// Luo taulukko juoksijoita varten
		Kilpajuoksija[] kilpailijat = new Kilpajuoksija[KILPAILIJALKM];
 		
		// Luo juoksijasäikeet
		for (int i = 0; i < KILPAILIJALKM; i++) {
			kilpailijat[i] = new Kilpajuoksija();
			// Pistä poppoo juoksemaan
			kilpailijat[i].start();
		}
		// Odota, että kaikki juoksijasäikeet lopettavat
//		try {
//			Thread.sleep(60000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		for (Kilpajuoksija kilpailija: kilpailijat) {
			try {
				kilpailija.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Kilpailu on ohi, onnea voittajalle.");
	}
}
