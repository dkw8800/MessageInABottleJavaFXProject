package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Main extends Application {

    Scene scene1, scene2, scene3, scene4;

    
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("My First JavaFX GUI");

//Scene 1
        Label label1= new Label("This is the first scene");
        Button button1= new Button("Go to scene 2");
        button1.setOnAction(e -> primaryStage.setScene(scene2));
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1= new Scene(layout1, 300, 250);

//Scene 2
        Label label2= new Label("This is the second scene");
        Button button2= new Button("Go to scene 3");
        button2.setOnAction(e -> primaryStage.setScene(scene3));
        VBox layout2= new VBox(20);
        layout2.getChildren().addAll(label2, button2);
        scene2= new Scene(layout2,300,250);

//Scene 3
        Label label3 = new Label("This is the third scene");
        Button button3 = new Button("Go to scene 4");
        button3.setOnAction(e -> primaryStage.setScene(scene4));
        VBox layout3 = new VBox(20);
        layout3.getChildren().addAll(label3, button3);
        scene3= new Scene(layout3,300,250);

        //Scene 4
        Label label4 = new Label("This is the fourth scene");
        Button button4 = new Button("Go to scene 1");
        button4.setOnAction(e -> primaryStage.setScene(scene1));
        VBox layout4 = new VBox(20);
        layout4.getChildren().addAll(label4, button4);
        scene4= new Scene(layout4,300,250);

        primaryStage.setScene(scene1);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }








    //NOTES
    //Label label1= new Label("This is the first scene"); This contains text. It can be text or an image. Here, a text box is placed and defined as label1 with the quote inside displayed.
    //Button button1= new Button("Go to scene 2"); This creates a button, the text inside is what will be on it
    //button1.setOnAction(e -> primaryStage.setScene(scene2)); This sets an action for the button to have. setScene is built in. We have to create new scenes.
    //VBox layout1 = new VBox(20); This reopens the virtual box, but it keeps it at the same size
    //layout1.getChildren().addAll(label1, button1); This function adds the label and button as children of the virtual box
    //scene1= new Scene(layout1, 300, 250); This initializes the first scene. The first scene is the layout with its children and the size is set up.
}