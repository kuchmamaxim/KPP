package gui;

import core.Logic;
import core.Master;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import pets.DogTypes;

import java.util.ArrayList;

public class Main extends Application {

    private Logic programLogic = new Logic();
    private Master master = new Master();

    private int getIndexByName(String choice) {
        int n = 0;
        ArrayList <String> petNames = master.getPetList();
        for (int i = 0; i < petNames.size(); i++) {
            if (petNames.get(i).equals(choice))
                n = i;
        }
        return n;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        master.addCat();
        master.addDog(DogTypes.POODLE);
        master.addDog(DogTypes.SHEPHERD);
        master.addDog(DogTypes.TERRIER);

        primaryStage.setResizable(true);
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 450, 210);
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(5);
        gridpane.setVgap(5);
        for (int i = 0; i < 3; i++) {
            ColumnConstraints column = new ColumnConstraints();
            column.setPercentWidth(100 / 3.0);
            gridpane.getColumnConstraints().add(column);
        }

        Label startLabelMaster = new Label("Choose an activity as a dog trainer:");
        gridpane.add(startLabelMaster, 0, 0, 2, 1);

        Label startLabelPet = new Label("... or as a pet:");
        gridpane.add(startLabelPet, 2, 0, 2, 1);

        Label dogLabel = new Label("Choose a dog:");
        gridpane.add(dogLabel, 0, 1);

        TextField commandTextField = new TextField();
        commandTextField.setMinWidth(135);
        commandTextField.setMaxWidth(135);
        gridpane.add(commandTextField, 0, 2);

        ComboBox petAsSubject = new ComboBox();
        petAsSubject.getItems().addAll(master.getPetList());
        petAsSubject.getSelectionModel().select(1);
        petAsSubject.setMinWidth(135);
        petAsSubject.setStyle("-fx-background-color: #F4C6C6");
        gridpane.add(petAsSubject, 1, 1);

        ComboBox petAsObject = new ComboBox();
        petAsObject.getItems().addAll(master.getPetList());
        petAsObject.getSelectionModel().select(1);
        petAsObject.setMinWidth(135);
        petAsObject.setStyle("-fx-background-color: #C6DBF4");
        gridpane.add(petAsObject, 2, 1);

        Button giveCommandButton = new Button("Give command");
        giveCommandButton.setMinWidth(135);
        giveCommandButton.setMaxWidth(135);
        gridpane.add(giveCommandButton, 1, 2);

        Button sleepButton = new Button("Sleep");
        sleepButton.setMinWidth(135);
        sleepButton.setMaxWidth(135);
        gridpane.add(sleepButton, 2, 2);

        Button feedButton = new Button("Feed");
        feedButton.setMinWidth(135);
        feedButton.setMaxWidth(135);
        gridpane.add(feedButton, 1, 3);

        Button askFoodButton = new Button("Ask for food");
        askFoodButton.setMinWidth(135);
        askFoodButton.setMaxWidth(135);
        gridpane.add(askFoodButton, 2, 3);

        Button walkButton = new Button("Walk");
        walkButton.setMinWidth(135);
        walkButton.setMaxWidth(135);
        gridpane.add(walkButton, 1, 4);


        Label answerLabel = new Label(" ");
        gridpane.add(answerLabel, 0, 5, 3, 2);

        giveCommandButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                int n = getIndexByName(petAsSubject.getValue().toString());
                answerLabel.setText(programLogic.giveCommand(master, n, commandTextField.getText().toString()));
            }
        });

        feedButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                int n = getIndexByName(petAsSubject.getValue().toString());
                answerLabel.setText(programLogic.feed(master, n));
            }
        });

        walkButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                int n = getIndexByName(petAsSubject.getValue().toString());
                answerLabel.setText(programLogic.walk(master, n));
            }
        });

        sleepButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                int n = getIndexByName(petAsObject.getValue().toString());
                answerLabel.setText(programLogic.sleep(n, master));
            }
        });

        askFoodButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                int n = getIndexByName(petAsObject.getValue().toString());
                answerLabel.setText(programLogic.askFood(n, master));
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
