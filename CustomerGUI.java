import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CustomerGUI extends Application
{
    public void start(Stage stage)
    {
        Label title = new Label("Customer account Details");

        Label nameLabel = new Label("Name of Customer:");
        Label bankLabel = new Label("Name of Bank:");
        Label accountLabel = new Label("Account No.:");
        Label panLabel = new Label("Pan Number:");

        TextField name = new TextField();
        TextField bank = new TextField();
        TextField account = new TextField();
        TextField pan = new TextField();

        Button submit = new Button("Submit");
        Label message = new Label();

        submit.setOnAction(e ->
        {
            if(name.getText().isEmpty() ||
               bank.getText().isEmpty() ||
               account.getText().isEmpty() ||
               pan.getText().isEmpty())
            {
                message.setText("Please enter all the details.");
            }
            else
            {
                message.setText("All details are entered.");
            }
        });

        GridPane root = new GridPane();

        root.setHgap(10);
        root.setVgap(8);

        root.add(title, 0, 0, 2, 1);

        root.add(nameLabel, 0, 1);
        root.add(name, 1, 1);

        root.add(bankLabel, 0, 2);
        root.add(bank, 1, 2);

        root.add(accountLabel, 0, 3);
        root.add(account, 1, 3);

        root.add(panLabel, 0, 4);
        root.add(pan, 1, 4);

        root.add(submit, 0, 5);
        root.add(message, 1, 5);

        Scene scene = new Scene(root, 500, 300);

        stage.setTitle("Customer Account Details");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[])
    {
        launch(args);
    }
}
