package dad.palindrome;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PalindromeApp extends Application {
		
		private Label palindromeLabel;
		private Button comprobarButton;
		private TextField nombreText;



	@Override
	public void start(Stage primaryStage) throws Exception {
		nombreText = new TextField();
		//nombreText.setPrefColumnCount(5);
		nombreText.setPromptText("Introduce un texto");
		nombreText.setMaxWidth(150);

		comprobarButton = new Button("Comprobar");
		comprobarButton.setDefaultButton(true);
		comprobarButton.setOnAction(e -> oncomprobarButtonAction(e));

		palindromeLabel = new Label("Aquí saldrá el saludo");
		

		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText, comprobarButton, palindromeLabel);

		Scene scene = new Scene(root, 320, 200);

		primaryStage.setTitle("");
		primaryStage.setScene(scene);
		primaryStage.show();
	}



	private void oncomprobarButtonAction(ActionEvent e) {
		String palabra = nombreText.getText();
		boolean palindromo;
		
		if(palindromo = true) {
			palindromeLabel.setText("Es palíndromo");
			palindromeLabel.setStyle("-fx-text-fill: green; -fx-font: 30;");
		}else {
			palindromeLabel.setText("No es palíndromo");
			palindromeLabel.setStyle("-fx-text-fill: red; -fx-font: 30;");
		}
	}
}
