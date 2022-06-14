
package suorakulmiot;

/**
 *
 * @author Johannes Palojärvi 19.1.2022
 */

// Kirjoita tähän yleiskommentit

public class NaytonSuorakulmio extends Suorakulmio {
	private int x;
	private int y;

	public NaytonSuorakulmio(int x, int y, int leveys, int korkeus) {
		super(leveys, korkeus);
		this.x = x;
		this.y = y;
	}

	public boolean mahtuu(int leveys, int korkeus) {
		// ensimmäinen oma ratkaisu
//		return (leveys <= this.getLeveys() && korkeus <= this.getKorkeus());

		// malliratkaisu
		if (x + super.getLeveys() > leveys || y + super.getKorkeus() > korkeus) {
			return false;
		}
		return true;

	}

	@Override
	public String toString() {
		return "x=" + this.x + ", y=" + this.y + ", leveys=" + this.getLeveys() + ", korkeus=" + this.getKorkeus();
	}

}
