package tervehdys;

public class TervehdysKontrolleri implements ITervehdysController {

	ITervehdysModel model = new TervehdysModel();
	ITervehdysUI gui;

	public TervehdysKontrolleri(TervehdysGUI gui) {
		this.gui = gui;
	}

	@Override
	public void tekstinGenerointi() {
		gui.setTeksti(model.generoiTeksti(gui.getTeksti()));

	}

}
