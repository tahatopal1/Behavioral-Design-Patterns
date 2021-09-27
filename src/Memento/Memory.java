package Memento;

import java.util.ArrayList;
import java.util.List;

public class Memory {

    private List<NotePadMemento> notePadMementos;

    public Memory() {
        notePadMementos = new ArrayList<>();
    }

    public void add(NotePadMemento memento){
        notePadMementos.add(memento);
    }

    public NotePadMemento getLastVersion(){
        if (!notePadMementos.isEmpty()){
            NotePadMemento lastMemento = notePadMementos.get(notePadMementos.size() - 1);
            notePadMementos.remove(lastMemento);
            return lastMemento;
        }else
            throw new ArrayIndexOutOfBoundsException("There is such no version!");
    }

}
