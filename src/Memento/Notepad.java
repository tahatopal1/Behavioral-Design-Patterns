package Memento;

public class Notepad {

    private String text;

    public Notepad() {
        text = "";
    }

    public Notepad(String text) {
        this.text = text;
    }

    public void append(String appendingText){
        text += appendingText;
    }

    public NotePadMemento save(){
        return new NotePadMemento(text);

    }

    public void rollback(NotePadMemento memento){
        text = memento.getText();
    }

    public void print(){
        System.out.println(text);
    }

}
