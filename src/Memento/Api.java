package Memento;

public class Api {
    public static void main(String[] args) {

        Memory memory = new Memory();

        Notepad notepad = new Notepad();
        notepad.append("J");
        notepad.append("O");
        notepad.append("H");
        notepad.append("N");

        saveVersion(memory, notepad);
        notepad.print();

        notepad.append("SON");
        saveVersion(memory, notepad);

        notepad.append(".");
        notepad.print();

        notepad.rollback(memory.getLastVersion());
        notepad.print();

        notepad.rollback(memory.getLastVersion());
        saveVersion(memory, notepad);
        notepad.print();

    }

    private static void saveVersion(Memory memory, Notepad notepad) {
        NotePadMemento memento = notepad.save();
        memory.add(memento);
    }
}
