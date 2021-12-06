package com.example.designpatterns.behavioral.strategy;

public class VerbalStrategy implements ExamStrategy{

    @Override
    public EnumLesson getFirst() {
        return EnumLesson.TURKCE;
    }

    @Override
    public EnumLesson getSecond() {
        return EnumLesson.SOSYAL;
    }

    @Override
    public EnumLesson getThird() {
        return EnumLesson.MATEMATİK;
    }

    @Override
    public EnumLesson getFourth() {
        return EnumLesson.FEN;
    }
}
