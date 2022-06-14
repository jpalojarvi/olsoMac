package saikeet;

import java.util.Random;

/**
 * @author Johannes Palojärvi 30.01.2022
 */

public class Kilpajuoksija extends Thread {
	private int numero; // juoksijan numero
	private final int MATKA = 400; // juostava matka, tässä vakio
	private double aika; // sekunteina
	private int juostuMatka;

	private static int seuraavaNumero = 1; // luokkamuuttuja juoksijoiden numeroimiseksi
	Random r = new Random();
public Kilpajuoksija() {
	this.numero = seuraavaNumero;
	setSeuraavaNumero();
}	
	
	public static void setSeuraavaNumero() {
		Kilpajuoksija.seuraavaNumero++;
	}
	
	public static void setSeuraavaNumero(int seuraavaNumero) {
		Kilpajuoksija.seuraavaNumero = seuraavaNumero;
	}

	@Override
	public void run() {

		// Ohjelmoi toisto, jossa
		// - käytät satunnaislukugeneraattoria 10 metrin juoksuajan saamiseksi
		// - odotat ko. ajan
		// - tulostat väliaikatiedon 50 metrin välein
		while (juostuMatka < MATKA) {
			try {
				int odotusAika = r.nextInt(1500-1075)+1075;
				Thread.sleep(odotusAika);
				this.juostuMatka += 10;
				this.aika += odotusAika/1000.0;
				if (this.juostuMatka % 50 == 0) {
					System.out.println("Juoksija #" + this.numero + ": juostu " + this.juostuMatka + "m, kulunut " + this.aika + " sekuntia");
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public double getAika() {
		return this.aika;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	@Override
	public String toString() {
		return "Juoksija #" + this.numero + ": juostu " + this.juostuMatka + "m, kulunut " + this.aika + " sekuntia";
	}
}
