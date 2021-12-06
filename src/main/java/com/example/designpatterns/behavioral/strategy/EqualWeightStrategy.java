package com.example.designpatterns.behavioral.strategy;

public class EqualWeightStrategy implements ExamStrategy{

    @Override
    public EnumLesson getFirst() {
        return EnumLesson.TURKCE;
    }

    @Override
    public EnumLesson getSecond() {
        return EnumLesson.MATEMATİK;
    }

    @Override
    public EnumLesson getThird() {
        return EnumLesson.SOSYAL;
    }

    @Override
    public EnumLesson getFourth() {
        return EnumLesson.FEN;
    }
}
