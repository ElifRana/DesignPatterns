package com.example.designpatterns.behavioral.memento;

public class App {

    public static void main(String[] args) {

        Memory memory = new Memory();

        NotePad notePad = new NotePad();
        notePad.add("S");
        notePad.add("E");
        notePad.add("V");

        NotePadMemento sev = notePad.save();
        memory.add(sev);

        notePad.print();

        notePad.add("Gİ");

        saveVersion(memory, notePad);

        incorrect(notePad);

        turnBack(memory, notePad);

        saveVersion(memory, notePad);

        notePad.add(" GÜZEL");

        saveVersion(memory, notePad);

        incorrect(notePad);

        turnBack(memory, notePad);

        turnBack(memory, notePad);

        turnBack(memory, notePad);


    }

    private static void turnBack(Memory memory, NotePad notePad) {
        notePad.turnBack(memory.getTheLatestVersion());
        notePad.print();
    }

    private static void incorrect(NotePad notePad) {
        notePad.add("...");

        notePad.print();
    }

    private static void saveVersion(Memory memory, NotePad notePad) {
        NotePadMemento memento = notePad.save();
        memory.add(memento);

        notePad.print();
    }

}
