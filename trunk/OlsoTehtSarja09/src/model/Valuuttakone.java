package model;

public class Valuuttakone implements IValuuttakone {
	private Valuutta[] valuutat = new Valuutta[4];

	public Valuuttakone() {
		this.valuutat[0] = new Valuutta("Euroopan euro", 1.0);
		this.valuutat[1] = new Valuutta("Ruotsin kruunu", 9.4780);
		this.valuutat[2] = new Valuutta("Norjan kruunu", 8.9018);
		this.valuutat[3] = new Valuutta("Yhdysvaltain dollari", 1.0629);
	}

	@Override
	public String[] getVaihtoehdot() {
		return null;
	}

	@Override
	public double muunna(int mistäIndeksi, int mihinIndeksi, double määrä) {
		double eurot = määrä / valuutat[mistäIndeksi].getVaihtokurssi();
		double kohdevaluutaksi = eurot * valuutat[mihinIndeksi].getVaihtokurssi();
		return kohdevaluutaksi;
	}
}
