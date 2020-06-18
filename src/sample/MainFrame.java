package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MainFrame {
    private double changeColorControl = 0;

    MainFrame() {
        Thread changeColors = new Thread(() -> {
            while (true) {
                if (changeColorControl == 1)
                    changeColor();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Change");
        changeColors.start();

        background2.setLayoutX(190);
        background3.setLayoutX(190 * 2);
        background4.setLayoutX(190 * 3);
        background5.setLayoutX(190 * 4);

        root.addEventHandler(KeyEvent.KEY_PRESSED, keyEvent1 -> {
            //System.out.println(keyEvent1);
            if (keyEvent1.getCode() == KeyCode.R && keyEvent1.isControlDown()) {
                changeColorControl = 1;

            }
            if (keyEvent1.getCode() == KeyCode.S && keyEvent1.isControlDown()) {
                changeColorControl = 0;
            }

        });

        root.getChildren().addAll(background1, background2, background3, background4, background5);
        root.getChildren().addAll(textWithButton.get(), textWithTwoButtons.get(), textButtonRadioGroup.get(), textButtonCheckBox.get(), table.get());
        window.setScene(scene);
        window.show();
        window.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                changeColors.stop();
                window.close();
            }
        });
    }
    //MainFrame mainFrame = new MainFrame();

    TextWithButton textWithButton = new TextWithButton();
    TextWithTwoButtons textWithTwoButtons = new TextWithTwoButtons();
    TextButtonRadioGroup textButtonRadioGroup = new TextButtonRadioGroup();
    TextButtonCheckBox textButtonCheckBox = new TextButtonCheckBox();
    Table table = new Table();
    Group root = new Group();
    Stage window = new Stage();
    Scene scene = new Scene(root, 1100, 600, Color.MISTYROSE);


    Rectangle background1 = new Rectangle(190, 170, Color.RED);
    Rectangle background2 = new Rectangle(190, 170, Color.GRAY);
    Rectangle background3 = new Rectangle(190, 170, Color.YELLOW);
    Rectangle background4 = new Rectangle(190, 170, Color.LIGHTCYAN);
    Rectangle background5 = new Rectangle(190 * 2, 170, Color.DARKSALMON);


    public void changeColor() {
        Color buff = (Color) background5.getFill();
        background5.setFill(background4.getFill());
        background4.setFill(background3.getFill());
        background3.setFill(background2.getFill());
        background2.setFill(background1.getFill());
        background1.setFill(buff);

    }


}
