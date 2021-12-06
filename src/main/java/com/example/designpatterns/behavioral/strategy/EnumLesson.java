package com.example.designpatterns.behavioral.strategy;

public enum EnumLesson {

    TURKCE("Türkçe"),
    MATEMATİK("Matematik"),
    FEN("Fen"),
    SOSYAL("Sosyal")
    ;

    private String lesson;

    EnumLesson(String lesson){
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return lesson;
    }
}
