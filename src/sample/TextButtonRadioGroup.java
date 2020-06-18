package sample;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class TextButtonRadioGroup {
    TextButtonRadioGroup(){
        vBox.setLayoutX(400);
        vBox.setLayoutY(10);
        a.setToggleGroup(groupOfButtons);
        b.setToggleGroup(groupOfButtons);
        c.setToggleGroup(groupOfButtons);
        findRadioButton.setOnAction(event -> {
            String tmp = textField.getText();

            if(tmp.equals(a.getText())){
                a.fire();
            }
            else if(tmp.equals(b.getText())) {
                b.fire();
            }
            else if(tmp.equals(c.getText())){
                c.fire();
            }else{
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Внимание");
                alert.setHeaderText("Не найдено соответствий");
                alert.setContentText("Проверьте правильность имени кнопки");
                alert.show();
            }
        });

        vBox.getChildren().addAll(taskNumber, textField, findRadioButton, a, b, c);
    }
    VBox vBox = new VBox();

    Label taskNumber = new Label("Задание 3");

    TextField textField =new TextField();
    Button findRadioButton =new Button("Найти кнопку");
    ToggleGroup groupOfButtons =new ToggleGroup();
    RadioButton a = new RadioButton("a");
    RadioButton b = new RadioButton("b");
    RadioButton c = new RadioButton("c");
    public VBox get() {
        return vBox;
    }

}
