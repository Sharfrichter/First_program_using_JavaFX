package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;


public class Table {
    Table(){
        tab.setPrefWidth(108);
        tab.setPrefHeight(130);
        tab.setLayoutX(150);
        tab.setLayoutY(20);
        column1.setCellValueFactory(new PropertyValueFactory<ClassForTable, String>("firstField"));
        tab.getColumns().add(column1);
        column2.setCellValueFactory(new PropertyValueFactory<ClassForTable, String>("secondField"));
        tab.getColumns().add(column2);
        group.setLayoutY(10);
        group.setLayoutX(800);
        textField.setLayoutY(20);
        enterData.setLayoutY(45);
        replaceInSecond.setLayoutY(70);
        replaceInFirst.setLayoutY(95);



            enterData.setOnAction(event -> {
                TableView.TableViewSelectionModel<ClassForTable> selectionModel = tab.getSelectionModel();
                if(!selectionModel.isEmpty())
                if("".equals((String)selectionModel.getSelectedItem().secondField.get()))
                selectionModel.getSelectedItem().firstField.setValue(textField.getText());
            });

            replaceInSecond.setOnAction(event -> {
                TableView.TableViewSelectionModel<ClassForTable> selectionModel = tab.getSelectionModel();
                if(!"".equals((String)selectionModel.getSelectedItem().firstField.get())) {
                    selectionModel.getSelectedItem().secondField.setValue(selectionModel.getSelectedItem().firstField.getValue());
                    selectionModel.getSelectedItem().firstField.setValue("");
                }
            });

            replaceInFirst.setOnAction(event -> {
                TableView.TableViewSelectionModel<ClassForTable> selectionModel = tab.getSelectionModel();
                if(!"".equals((String)selectionModel.getSelectedItem().secondField.get())){
                    selectionModel.getSelectedItem().firstField.setValue(selectionModel.getSelectedItem().secondField.getValue());
                    selectionModel.getSelectedItem().secondField.setValue("");
                }
            });


        group.getChildren().addAll(taskNumber, textField, enterData, replaceInSecond, replaceInFirst);
    }
    ObservableList<ClassForTable> listForTable = FXCollections.observableArrayList(

            new ClassForTable(),
            new ClassForTable(),
            new ClassForTable(),
            new ClassForTable()
    );

    TableView<ClassForTable> tab = new TableView<ClassForTable>(listForTable);




    TableColumn<ClassForTable,String> column1 =new TableColumn<ClassForTable,String>("First ");

    TableColumn<ClassForTable,String> column2 =new TableColumn<ClassForTable,String>("Second");

    Group group =new Group(tab);
    Label taskNumber =new Label("Задание 5");
    TextField textField = new TextField();
    Button enterData = new Button("Занести данные");
    Button replaceInSecond = new Button("Перенести во 2");
    Button replaceInFirst = new Button("Перенести в 1");
    public Group get() {
        return group;
    }





}
