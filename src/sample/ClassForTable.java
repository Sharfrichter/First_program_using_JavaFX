package sample;
import javafx.beans.property.*;


public class ClassForTable {
    public ClassForTable(){
        this.firstField = new SimpleStringProperty("");
        this.secondField = new SimpleStringProperty("");

    }
    public SimpleStringProperty firstField;
    public SimpleStringProperty secondField;

    public String getFirstField() {
        return firstField.get();
    }

    public SimpleStringProperty firstFieldProperty() {
        return firstField;
    }

    public void setFirstField(String firstField) {
        this.firstField.set(firstField);
    }

    public String getSecondField() {
        return secondField.get();
    }

    public SimpleStringProperty secondFieldProperty() {
        return secondField;
    }

    public void setSecondField(String secondField) {
        this.secondField.set(secondField);
    }

    public void swapFields(){
        SimpleStringProperty tmp=new SimpleStringProperty();
        tmp=this.firstField;
        this.firstField =this.secondField;
        this.secondField =tmp;
    }
}
