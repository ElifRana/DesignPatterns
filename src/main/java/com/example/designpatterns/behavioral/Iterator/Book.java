package com.example.designpatterns.behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Book {

    private String name;

    private List<Question> questionList;

    public Book(String name) {
        this.name = name;
        this.questionList = new ArrayList<>();

        questionList.add(new Question(1L));
        questionList.add(new Question(2L));
        questionList.add(new Question(3L));
        questionList.add(new Question(4L));
        questionList.add(new Question(5L));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Iterator getQuestionIterator() {
        return questionList.iterator();
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
