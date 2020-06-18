package sample;


import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class TextWithButton {
      TextWithButton(){
         enterText.setOnAction(event -> {
                    if(!listOfElements.contains(textField.getText()))
                    {
                       listOfElements.add(textField.getText());
                       comboBox.getItems().add(textField.getText());}
                    else {
                       Alert alert=new Alert(Alert.AlertType.ERROR);
                       alert.setTitle("Внимание");
                       alert.setHeaderText("Добавление невозможно");
                       alert.setContentText("Введенная вами строка уже есть в списке");
                       alert.show();

                    }
                 }
         );
         vBox.setLayoutY(10);
         vBox.setLayoutX(10);
         vBox.getChildren().add(taskNumber);
         vBox.getChildren().add(textField);
         vBox.getChildren().add(enterText);
         vBox.getChildren().add(comboBox);

      }
   Button enterText = new Button("Занести строку");
   TextField textField =new TextField();
   VBox vBox = new VBox();
   Label taskNumber =new Label("Задание 1");
   public ComboBox<String> comboBox =new ComboBox<String>();
   ArrayList<String> listOfElements =new ArrayList<String>();

    public VBox get() {
        return vBox;
    }
}
