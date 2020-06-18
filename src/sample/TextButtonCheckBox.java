package sample;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class TextButtonCheckBox {
    TextButtonCheckBox(){
        vBox.setLayoutY(10);
        vBox.setLayoutX(600);

        findFlag.setOnAction(event -> {
            String tmp= textField.getText();
            if(tmp.equals(a.getText()))
                a.fire();
            else if(tmp.equals(b.getText()))
                b.fire();
            else if (tmp.equals(c.getText()))
                c.fire();
            else
            {
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Внимание");
                alert.setHeaderText("Не найдено соответствий");
                alert.setContentText("Проверьте правильность имени кнопки");
                alert.show();
            }
        });
        vBox.getChildren().addAll(taskNumber, textField, findFlag, a, b, c);
    }
    VBox vBox =new VBox();


    Label taskNumber =new Label("Задание 4");
    TextField textField =new TextField();
    Button findFlag =new Button("Найти флаг");
    CheckBox a =new CheckBox("a");
    CheckBox b =new CheckBox("b");
    CheckBox c =new CheckBox("c");
    public VBox get() {
        return vBox;
    }


}
