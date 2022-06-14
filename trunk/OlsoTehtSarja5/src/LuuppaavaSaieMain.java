import saikeet.LuuppaavaSaie;

/**
* @author Johannes Palojärvi 30.01.2022
*/

public class LuuppaavaSaieMain {
	public static void main(String[] args) {

    // Luo säie
	LuuppaavaSaie luuppaavaSaie = new LuuppaavaSaie(500);
	
	// Tulosta aluksi kierrettyjen kierrosten lukumäärä
	System.out.println(luuppaavaSaie.getKierretytKierrokset());
	
	// Käynnistä säie
	luuppaavaSaie.start();
	
	// Odota säikeen päättymistä
	try {
		luuppaavaSaie.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	// Tulosta lopuksi säikeen kiertämien kierrosten lukumäärä
	System.out.println(luuppaavaSaie.getKierretytKierrokset());
	
	}
}
