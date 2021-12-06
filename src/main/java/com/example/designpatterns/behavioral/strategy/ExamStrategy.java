package com.example.designpatterns.behavioral.strategy;

public interface ExamStrategy {

    EnumLesson getFirst();
    EnumLesson getSecond();
    EnumLesson getThird();
    EnumLesson getFourth();
}
