package com.example.designpatterns.behavioral.Iterator;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        Book book = new Book("Matematik");
        Fascicle fascicle = new Fascicle("Türkçe");

//        List<Question> questionList = book.getQuestionList();
//
//        for (Question question : questionList) {
//            Long questionNo = question.getQuestionNo();
//
//            System.out.println("Soru no: " + questionNo);
//        }

//        Question[] questions = fascicle.getQuestions();
//
//        for (Question question : questions) {
//            Long questionNo = question.getQuestionNo();
//
//            System.out.println("Soru no: " + questionNo);
//        }


        Iterator questionIteratorBook = book.getQuestionIterator();
        Iterator questionIteratorFascicle = fascicle.getQuestionIterator();

        yazdir(questionIteratorBook);
        yazdir(questionIteratorFascicle);

    }

    private static void yazdir(Iterator questionIteratorBook) {
        while (questionIteratorBook.hasNext()) {
            Question question = (Question) questionIteratorBook.next();

            Long questionNo = question.getQuestionNo();

            System.out.println("Soru no: " + questionNo);
        }
    }

}
