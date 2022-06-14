package valtiot;

/**
 * @author Johannes Palojärvi 26.1.2022
 */

public class Valtio {

	private static final long serialVersionUID = 1L;
	// Selvitä itsellesi www-haulla mikä on ylläolevan merkitys/tarve

	private String nimi;
	private String pääkaupunki;
	private int asukasluku;

	// Lisää getterit ja setterit
	public int getAsukasluku() {
		return asukasluku;
	}

	public void setAsukasluku(int asukasluku) {
		this.asukasluku = asukasluku;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getPääkaupunki() {
		return pääkaupunki;
	}

	public void setPääkaupunki(String pääkaupunki) {
		this.pääkaupunki = pääkaupunki;
	}

	// Konstruktori
	public Valtio(String nimi, String pääkaupunki, int asukasluku) {
		this.nimi = nimi;
		this.pääkaupunki = pääkaupunki;
		this.asukasluku = asukasluku;
	}

	// Lisää toString()
	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10d", nimi, pääkaupunki, asukasluku);
	}

	// Saat tiedot sarakkeittain String-luokan staattisella format-metodilla
	// esim. String.format("%-10s %-10s %-10d", nimi, pääkaupunki, asukasluku);

}
