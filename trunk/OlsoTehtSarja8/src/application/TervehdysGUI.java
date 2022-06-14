package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TervehdysGUI extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Tervehdyksiä");
			GridPane grid = new GridPane(); // Asettelupohjana ruudukko

			Button aamu = new Button("Aamu");
			Button paiva = new Button("Päivä");
			Button ilta = new Button("Ilta");
			Button yo = new Button("Yö");
			Text teksti = new Text("Napsauta painiketta.");
			teksti.setFont(Font.font("Arial", FontWeight.BOLD, 20));
			aamu.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					teksti.setText("Hyvää huomenta");
				}
			});

			paiva.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					teksti.setText("Hyvää päivää");
				}
			});

			ilta.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					teksti.setText("Hyvää iltaa");
				}
			});

			yo.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					teksti.setText("Hyvää yötä");
				}
			});
			aamu.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
			paiva.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
			ilta.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
			yo.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
			grid.setAlignment(Pos.CENTER);
			grid.setVgap(20);
			grid.setHgap(10);
			grid.add(teksti, 1, 0);
			grid.add(aamu, 0, 1); // Lisää elementit asettelupohjaan
			grid.add(paiva, 1, 1); // sarake, rivi
			grid.add(ilta, 2, 1);
			grid.add(yo, 3, 1);

			Scene scene = new Scene(grid, 400, 100);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene); // Aseta tämä näkymä näyttämölle
			primaryStage.show(); // Näytä se (~refresh)
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}