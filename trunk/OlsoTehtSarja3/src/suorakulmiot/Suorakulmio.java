
package suorakulmiot;

/**
 *
 * @author Johannes Palojärvi 19.1.2022
 */

// Kirjoita tähän yleiskommentit

public class Suorakulmio {
	private int leveys;
	private int korkeus;

	public Suorakulmio(int leveys, int korkeus) {
		this.leveys = leveys;
		this.korkeus = korkeus;
	}

	public Suorakulmio() {
		// TODO Auto-generated constructor stub
	}

	public int ala() {
		return this.leveys * this.korkeus;
	}

	public void setKorkeus(int korkeus) {
		this.korkeus = korkeus;
	}

	public void setLeveys(int leveys) {
		this.leveys = leveys;
	}

	public int getKorkeus() {
		return korkeus;
	}

	public int getLeveys() {
		return leveys;
	}

	@Override
	public String toString() {
		return "leveys=" + this.getLeveys() + ", korkeus=" + this.getKorkeus(); 
	}
	
}
