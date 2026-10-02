import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginGUI extends Application
{
	public void start(Stage stage)
	{

		Label userLabel = new Label("Username:");
		Label passLabel = new Label("Password:");

		TextField username = new TextField();
		PasswordField password = new PasswordField();

		Button login = new Button("Login");
		Button reset = new Button("Reset");

		Label result = new Label();

		login.setOnAction(e ->
				{
					String user = username.getText();
					String pass = password.getText();

					if(user.equals("admin") && pass.equals("admin"))
					{
						result.setText("Login Successful");
					}
					else
					{
						result.setText("Invalid Username or password");
					}
				});

		reset.setOnAction(e ->
				{
					username.clear();
					password.clear();
					result.setText("");
				});

		GridPane root = new GridPane();

		root.setHgap(10);
		root.setVgap(10);

		root.add(userLabel,0,0);
		root.add(username,1,0);

		root.add(passLabel,0,1);
		root.add(password,1,1);

		root.add(login,0,2);
		root.add(reset,1,2);

		root.add(result,1,3);

		Scene scene = new Scene(root,400,250);

		stage.setTitle("Login");
		stage.setScene(scene);
		stage.show();
	}


	public static void main(String args[])
	{
		launch(args);
	}
}

