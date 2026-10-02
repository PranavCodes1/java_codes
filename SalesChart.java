import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SalesChart extends Application
{
    public void start(Stage stage)
    {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Items");
        yAxis.setLabel("Sales");

        BarChart<String, Number> chart =
            new BarChart<>(xAxis, yAxis);

        chart.setTitle("Sales Comparison 2024 and 2025");

        XYChart.Series<String, Number> sales2024 =
            new XYChart.Series<>();

        sales2024.setName("2024");

        sales2024.getData().add(
            new XYChart.Data<>("Laptop", 350)
        );

        sales2024.getData().add(
            new XYChart.Data<>("Mobile", 650)
        );

        sales2024.getData().add(
            new XYChart.Data<>("Bluetooth", 525)
        );

        sales2024.getData().add(
            new XYChart.Data<>("Smart Watch", 760)
        );

        XYChart.Series<String, Number> sales2025 =
            new XYChart.Series<>();

        sales2025.setName("2025");

        sales2025.getData().add(
            new XYChart.Data<>("Laptop", 425)
        );

        sales2025.getData().add(
            new XYChart.Data<>("Mobile", 730)
        );

        sales2025.getData().add(
            new XYChart.Data<>("Bluetooth", 450)
        );

        sales2025.getData().add(
            new XYChart.Data<>("Smart Watch", 675)
        );

        chart.getData().addAll(sales2024, sales2025);

        StackPane root = new StackPane();
        root.getChildren().add(chart);

        Scene scene = new Scene(root, 700, 500);

        stage.setTitle("Sales Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[])
    {
        launch(args);
    }
}
