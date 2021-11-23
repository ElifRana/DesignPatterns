package com.example.designpatterns.behavioral.Iterator;

public class Fascicle {

    private String name;

    private Question[] questions;

    public Fascicle(String name) {
        this.name = name;
        this.questions = new Question[10];

        questions[0] = new Question(6L);
        questions[1] = new Question(7L);
        questions[2] = new Question(8L);
        questions[3] = new Question(9L);
        questions[4] = new Question(10L);
        questions[5] = new Question(11L);
        questions[6] = new Question(12L);
        questions[7] = new Question(13L);
        questions[8] = new Question(14L);
        questions[9] = new Question(15L);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QuestionIterator getQuestionIterator() {
        return new QuestionIterator(questions);
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
}
