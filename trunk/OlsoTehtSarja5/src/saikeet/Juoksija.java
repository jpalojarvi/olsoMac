package saikeet;

/**
* @author Johannes Palojärvi 30.01.2022
*/

public class Juoksija extends Thread {
	private volatile boolean jatkuu = true;
	private int kierrokset = 0;

	// Kirjoita kierrokset-muuttujan getteri
	public int getKierrokset() {
		return kierrokset;
	}
	
	@Override
	public void run(){
		while (jatkuu) {
			try {
				this.kierrokset++;
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public boolean isJuoksemassa() {
		return this.jatkuu;
	}

	// Kun juokseminen halutaan lopettaa, joku toinen säie kutsuu 
	// lopeta()-metodia.
	public void lopeta(){
		this.jatkuu = false;
		 
	}
}
