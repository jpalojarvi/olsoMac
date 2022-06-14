package saikeet;

/**
* @author Johannes Palojärvi 30.01.2022
*/

public class LuuppaavaSaie extends Thread {

	// Pakkaustason näkyvyys
    int pyydetytKierrokset;
    int kierretytKierrokset;

	// Kirjoita parametrillinen konstruktori, joka asettaa pyydetyt kierrokset
    public LuuppaavaSaie(int pyydetytKierrokset) {
		this.pyydetytKierrokset = pyydetytKierrokset;
	}
	
	// Kirjoita getteri kierretyille kierroksille
    public int getKierretytKierrokset() {
		return kierretytKierrokset;
	}
	
	// Kirjoita metodi run(), jossa säie kiertää toistossa pyydetyt kierrokset 
    @Override
    public void run() {
    	for (int i = 0; i < this.pyydetytKierrokset; i++) {
    		this.kierretytKierrokset++;
    		System.out.println(this.getKierretytKierrokset());
    	}
    	super.run();
    }
    
	// kertaa siten, että kierrettyjen kierrosten loppuarvoksi jää toiston päätyttyä
	// kierretyt kierrokset. Sen tulee olla lopuksi siis sama kuin pyydetyt kierrokset.
	// Tulosta jokaisella kierroksella kierroksen numero.
}
