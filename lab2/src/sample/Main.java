package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Logic programLogic = new Logic();

    private int getIndexByName(String choice){
        int n = 0;
        for (int i = 0; i < programLogic.getDogList().size(); i++) {
            if (programLogic.getDogList().get(i).equals(choice))
                n = i;
        }
        return n;
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setResizable(true);
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 300, 180);
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

        Label label = new Label("Choose an activity as a dog trainer!");
        label.setAlignment(Pos.CENTER);
        gridpane.add(label, 0, 0, 2, 1);
        label.setAlignment(Pos.CENTER);

        Label dogLabel = new Label("Choose a dog:");
        gridpane.add(dogLabel, 0, 1);

        TextField commandTextField = new TextField();
        gridpane.add(commandTextField , 0, 2);

        ComboBox dogChoice = new ComboBox();

        for(int i = 0; i<programLogic.getDogList().size(); i++) {
            dogChoice.getItems().addAll(programLogic.getDogList().get(i));
        }
        dogChoice.getSelectionModel().select(1);
        dogChoice.setMinWidth(135);
        gridpane.add(dogChoice , 1, 1);

        Button giveCommandButton = new Button("Give command");
        giveCommandButton.setMinWidth(135);
        giveCommandButton.setMaxWidth(135);
        gridpane.add(giveCommandButton, 1, 2);

        Button feedButton = new Button("Feed");
        feedButton.setMinWidth(135);
        feedButton.setMaxWidth(135);
        gridpane.add(feedButton, 1, 3);


        Label answerLabel = new Label (" ");
        gridpane.add(answerLabel, 0, 4, 2, 2);

        giveCommandButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                int n = getIndexByName(dogChoice.getValue().toString());
                answerLabel.setText(programLogic.giveCommand(n, commandTextField.getText().toString()));
            }
        });

        feedButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                int n = getIndexByName(dogChoice.getValue().toString());
                answerLabel.setText(programLogic.feed(n));
            }
        });

        root.setCenter(gridpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
