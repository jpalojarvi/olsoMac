package sharedXY;

/**
 * @author Johannes Palojärvi 01.02.2022
 */

// TEHTÄVÄ 2A TOTEUTUS, pysähtyy ajon aikana
//public class SharedXY {
//	private static int x;
//	private static int y;
//
//	// Kirjoita konstruktori, joka asettaa muuttujille alkuarvot
//	public SharedXY() {
//		SharedXY.x = 0;
//		SharedXY.y = 1;
//	}
//
//	// Kirjoita metodi swap(), joka vaihtaa arvot keskenään
//	public static void swap() {
//		System.out.println("Alkuperäinen X: " + SharedXY.x);
//		System.out.println("Alkuperäinen Y: " + SharedXY.y);
//
//		System.out.println("Vaihdetaan X:n ja Y:n arvot keskenään...");
//		int z;
//		z = SharedXY.x;
//		SharedXY.x = SharedXY.y;
//		SharedXY.y = z;
//
//		System.out.println("Uusi X: " + SharedXY.x);
//		System.out.println("Uusi Y: " + SharedXY.y + "\n");
//	}
//
//	public static int getX() {
//		return x;
//	}
//
//	public static int getY() {
//		return y;
//	}
//}


// TEHTÄVÄN 2B TOTEUTUS, ei pysähdy ajon aikana
public class SharedXY {
	private static int x;
	private static int y;

	// Kirjoita konstruktori, joka asettaa muuttujille alkuarvot
	public SharedXY() {
		this.x = 0;
		this.y = 1;
	}

	// Kirjoita metodi swap(), joka vaihtaa arvot keskenään
	public synchronized void swap() {
		System.out.println("Alkuperäinen X: " + this.x);
		System.out.println("Alkuperäinen Y: " + this.y);

		System.out.println("Vaihdetaan X:n ja Y:n arvot keskenään...");
		int z = this.x;
		this.x = this.y;
		this.y = z;

		System.out.println("Uusi X: " + this.x);
		System.out.println("Uusi Y: " + this.y + "\n");
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public synchronized boolean xEqualsY() {
		return this.x == this.y;
	}
}