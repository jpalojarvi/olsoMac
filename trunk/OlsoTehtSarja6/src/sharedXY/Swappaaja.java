package sharedXY;

/**
 * @author Johannes Palojärvi 01.02.2022
 */

// TEHTÄVÄ 2A TOTEUTUS, pysähtyy ajon aikana
//public class Swappaaja extends Thread {
//	private static volatile boolean valmis = false;
//	SharedXY sharedxy;
//
//	// Kirjoita konstruktori
//	public Swappaaja(SharedXY sharedxy) {
//		this.sharedxy = sharedxy;
//	}
//
//	// Kirjoita metodi run()
//	public void run() {
//		while (!valmis) {
//			SharedXY.swap();
//			try {
//				sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			if (SharedXY.getX() == SharedXY.getY()) {
//				valmis = true;
//			}
//		}
//		System.exit(0);
//	}
//}

// TEHTÄVÄ 2B TOTEUTUS, ei pysähdy ajon aikana
public class Swappaaja extends Thread {
	private static boolean valmis = false;
	SharedXY sharedxy;

	// Kirjoita konstruktori
	public Swappaaja(SharedXY sharedxy) {
		this.sharedxy = sharedxy;
	}

	// Kirjoita metodi run()
	public void run() {

		int x = sharedxy.getX();
		int y = sharedxy.getY();

		do {
			sharedxy.swap();
		} while (!sharedxy.xEqualsY());

//		synchronized (this) {
//			while (!valmis) {
//				sharedxy.swap();
//				try {
//					sleep(10);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				if (x == y) {
//					System.out.println("Löydetty samat");
//					valmis = true;
//				}
//			}
		System.exit(0);
	}
}