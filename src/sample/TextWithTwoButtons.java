package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class TextWithTwoButtons {
    TextWithTwoButtons(){
        vBox.setLayoutY(10);
        vBox.setLayoutX(200);
        renameSecondButton.setOnAction(event -> {
            swapButtons.setText(textField.getText());
        });
        swapButtons.setOnAction(event -> {
            String tmp= renameSecondButton.getText();
            renameSecondButton.setText(swapButtons.getText());
            swapButtons.setText(tmp);
        });
        vBox.getChildren().addAll(taskNumber, textField, renameSecondButton, swapButtons);
    }

    VBox vBox =new VBox();
    Label taskNumber =new Label("Задание 2");
    TextField textField =new TextField();
    Button renameSecondButton =new Button("Переименовать кнопку");
    Button swapButtons =new Button("Поменять надписи");
    public VBox get() {
        return vBox;
    }
}
