import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ExpenseChart extends Application
{
	public void start(Stage stage)
	{
		PieChart pieChart = new PieChart();

		pieChart.getData().add(new PieChart.Data("Food",3000));
		pieChart.getData().add(new PieChart.Data("Rent",15000));
		pieChart.getData().add(new PieChart.Data("Transport",2000));
		pieChart.getData().add(new PieChart.Data("Entertainment",2000));
		pieChart.getData().add(new PieChart.Data("Others",1000));

		pieChart.setTitle("Monthly Expenses");

		StackPane root = new StackPane();
		root.getChildren().add(pieChart);
		
		Scene scene = new Scene(root,600,500);

		stage.setTitle("Monthly Expenses");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String args[])
	{
		launch(args);
	}
}



