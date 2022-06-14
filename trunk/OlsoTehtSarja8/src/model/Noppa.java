package model;

import java.util.Random;

public class Noppa {
	private int sivuLkm;
	private static int heittojenLkm;

	public Noppa(int sivulkm) {
		this.sivuLkm = sivulkm;
	}

	public int heitä() {
		Random random = new Random();
		heittojenLkm++;
		return random.nextInt(sivuLkm - 1) + 1;
	}

	public int getHeittojenLkm() {
		return heittojenLkm;
	}
}
