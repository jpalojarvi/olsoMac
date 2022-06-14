package readerwriter;

/**
* @author Johannes Palojärvi 01.02.2022
*/

public class Lukija extends Thread {
	private IntSailio sailio;
	private boolean done = false;

	public Lukija(IntSailio sailio) {
		this.sailio = sailio;
	}

	public void run() {
		int luku;
		int summa = 0;

		try {
			luku = sailio.getInt();

			while (luku > 0 && !done) {
				System.out.println(this + " luki luvun " + luku);
				summa += luku;
				sleep(500);
				luku = sailio.getInt(); // seuraava luku
			}
			System.out.println("Lukijasäikeen suoritus päättyi");
			System.out.println(this + " sai summaksi " + summa);
		} catch (InterruptedException e) {
			System.out.println("Sleep keskeytyi");
		}
	}

	public void terminate() {
		done = true;
	}
}
