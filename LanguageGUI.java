import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LanguageGUI extends Application
{
	public void start(Stage stage)
	{
		Label title = new Label("Select Programming Language:");

		ComboBox<String> languages = new ComboBox<>();

		languages.getItems().addAll("Java","Python","C","C++","PHP");

		Button show = new Button("Show");

		Label result = new Label();

		show.setOnAction(e -> {
			String language = languages.getValue();
			result.setText("Selected language=" +language);
		});

		VBox root = new VBox(10);
		root.getChildren().addAll(title,languages,show,result);

		Scene scene= new Scene(root,400,300);

		stage.setTitle("Programming Language");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String args[])
	{
		launch(args);
	}
}

