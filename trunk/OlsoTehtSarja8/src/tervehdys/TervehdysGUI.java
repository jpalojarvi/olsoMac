package tervehdys;

import java.awt.Button;

import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TervehdysGUI extends Application implements ITervehdysUI {

	// Kontrollerin esittely (tarvitaan käyttöliittymässä)
	private ITervehdysController kontrolleri;

	// Käyttöliittymäkomponentit:
	private TextField teksti;
	private Button btn;

	@Override
	public void init() {
		// MVC-rakenteeseen kuuluvan kontrollerin luonti
		kontrolleri = new TervehdysKontrolleri(this);
	}

	@Override
	public void start(Stage primaryStage) {
		// Käyttöliittymän rakentaminen
		try {
			primaryStage.setTitle("Tervehdyksiä");

			btn = new Button();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getTeksti() {
		try {
			return this.getTeksti();
		} catch (Error e) {

		}
		return null;
	}

	@Override
	public void setTeksti(String teksti) {
		this.teksti.setText(teksti);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
