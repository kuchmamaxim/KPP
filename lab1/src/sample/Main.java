package sample;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
//import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    public static final double PI = 3.1415;

     static String angleType (Integer Degrees)
    {
        if(Degrees >= 0 && Degrees < 90)
            return "Острый угол";
        else if(Degrees == 90)
            return "Прямой угол";
        else if(Degrees < 180)
            return "Тупой угол";
        else if(Degrees == 180)
            return "Развёрнутый угол";
        else
            return "Ошибка! Введите угол до 180 градусов!";
    }

    @Override  public void start(Stage primaryStage) {
        primaryStage.setResizable(true);
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 330, 145);
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(5);
        gridpane.setVgap(5);
        for (int i = 0; i < 2; i++)
        {
            ColumnConstraints column = new ColumnConstraints();
            column.setPercentWidth(100 / 2.0);
            gridpane.getColumnConstraints().add(column);
        }

        Label label = new Label("Градусы");
        label.setCenterShape(true);
        gridpane.add(label, 0, 0);
        TextField degreesTextField = new TextField();
        gridpane.add(degreesTextField, 1, 0);

        label = new Label("Радианы");
        gridpane.add(label, 0, 1);
        TextField radianTextField = new TextField();
        gridpane.add(radianTextField, 1, 1);
        Button calculateRadButton = new Button("Посчитать радианы");
        gridpane.add(calculateRadButton, 0, 3);

        Button calculateDegButton = new Button("Посчитать градусы");
        gridpane.add(calculateDegButton, 1, 3);


        Label angleTypeLabel = new Label (" ");
        gridpane.add(angleTypeLabel, 0, 2, 2, 1);
        //gridpane.set(Pos.CENTER);

        calculateRadButton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent e)
            {
                double
                Double Degrees = Double.parseDouble(degreesTextField.getText());
                Double Radians = new BigDecimal(Degrees*PI / 180).setScale(4, RoundingMode.HALF_UP).doubleValue();
                angleTypeLabel.setText(angleType(Degrees.intValue()));
                radianTextField.setText(String.valueOf(Radians));
            }
        });

        calculateDegButton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent e)
            {
                Double Radians = Double.parseDouble(radianTextField.getText());
                Integer Degrees = new BigDecimal(Radians * 180 / PI).setScale(0, RoundingMode.HALF_UP).intValue();
                angleTypeLabel.setText(angleType(Degrees));
                degreesTextField.setText(String.valueOf(Degrees));
            }
        });

        root.setCenter(gridpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
