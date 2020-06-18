package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application{
    @Override
    public void start(Stage primaryStage){
        new MainFrame();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
