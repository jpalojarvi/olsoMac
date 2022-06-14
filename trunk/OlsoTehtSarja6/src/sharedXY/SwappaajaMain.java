package sharedXY;

/**
 * @author Johannes Palojärvi 01.02.2022
 */

public class SwappaajaMain {
	public static void main(String args[]) {
		// Luo yhteiskäyttöinen tietorakenneolio
		SharedXY sharedxy = new SharedXY();

		// Luo useita Swappaaja-säikeitä
		final int maara = 10;
		Swappaaja[] swappaajat = new Swappaaja[maara];
		for (int i = 0; i < maara; i++) {
			swappaajat[i] = new Swappaaja(sharedxy);
			swappaajat[i].start();
		}
	}
}