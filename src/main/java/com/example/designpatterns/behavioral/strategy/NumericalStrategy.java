package com.example.designpatterns.behavioral.strategy;

public class NumericalStrategy implements ExamStrategy{

    @Override
    public EnumLesson getFirst() {
        return EnumLesson.MATEMATİK;
    }

    @Override
    public EnumLesson getSecond() {
        return EnumLesson.TURKCE;
    }

    @Override
    public EnumLesson getThird() {
        return EnumLesson.FEN;
    }

    @Override
    public EnumLesson getFourth() {
        return EnumLesson.SOSYAL;
    }
}
