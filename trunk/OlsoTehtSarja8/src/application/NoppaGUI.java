package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Noppa;

public class NoppaGUI extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Noppa - MVC");
			BorderPane root = new BorderPane();
			Button btn = new Button("Heitä noppaa");
			btn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					Noppa noppa = new Noppa(6);
					Text txt = new Text("Tulos: " + noppa.heitä() + ". Heittokertoja " + noppa.getHeittojenLkm() + ".");
					txt.setFont(Font.font("Arial", FontWeight.BOLD, 20));
					BorderPane.setAlignment(txt, Pos.CENTER);
					root.setTop(txt);
				}
			});
			root.setCenter(btn);
			primaryStage.setScene(new Scene(root, 300, 100));
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}