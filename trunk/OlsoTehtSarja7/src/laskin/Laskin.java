package laskin;

public class Laskin {

	private double tulos; // Muuttuja tulokselle

	public void nollaa() { // Nollaa tulosmuuttuja
		tulos = 0;
	}

	public double annaTulos() {
		return tulos;
	}

	public void lisaa(int n) {
		tulos = tulos + n;
	}

	public void vahenna(int n) {
		tulos = tulos - n;
	}

	public void kerro(int n) {
		tulos *= n;
	}

	public void jaa(int n) {
		if (n == 0) {
			throw new IllegalArgumentException("Nollalla ei voi jakaa");
		}
		tulos = tulos / n;
	}

	public void nelio(double luku) {
		tulos = Math.pow(luku, 2);
	}

	public void neliojuuri(double n) {
		if (n < 0) {
			throw new IllegalArgumentException("Negatiivisella luvulla ei ole neliöjuurta");
		}
		tulos = java.lang.Math.sqrt(n);
	}

	public void virtaON() {
		// Tähän voisi laittaa muutkin alkutoimet
		tulos = 0;
	}

	public void virtaOFF() {
		// Tähänn voisi laittaa lopputoimet
	}

}
