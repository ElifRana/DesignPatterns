package com.example.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Memory {

    private List<NotePadMemento> list;

    public Memory() {
        this.list = new ArrayList<>();
    }

    public void add(NotePadMemento memento) {
        list.add(memento);
    }

    public NotePadMemento getTheLatestVersion(){
        if (!list.isEmpty()){
            NotePadMemento latestVersion = list.get(list.size() - 1);

            list.remove(latestVersion);

            return latestVersion;
        } else  {
            throw new ArrayIndexOutOfBoundsException("Yüklü versiyon bulunamadı !");
        }
    }
}
