public class Asiakas {
	private static int seuraavaId = 0;
	private int id;
	private long aloitusaika;
	private long lopetusaika;

	public Asiakas() {
		System.out.println(seuraavaId);
		seuraavaId++;
		System.out.println(seuraavaId);
		this.setId(seuraavaId);
		this.aloitusaika = System.currentTimeMillis();
	}

	public int getId() {
		return this.id;
	}

	public long getAloitusaika() {
		return this.aloitusaika;
	}

	public long getLopetusaika() {
		return this.lopetusaika;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAloitusaika(long aloitusaika) {
		this.aloitusaika = System.currentTimeMillis();
	}

	public void setLopetusaika(long lopetusaika) {
		this.lopetusaika = lopetusaika;
	}

	public long kaytettyAika(long aloitusaika, long lopetusaika) {
		return lopetusaika - aloitusaika;
	}

	@Override
	public String toString() {
		return "ID: " + this.getId() + ", aloitusaika: " + this.getAloitusaika() + ", lopetusaika: "
				+ this.getLopetusaika();
	}

}