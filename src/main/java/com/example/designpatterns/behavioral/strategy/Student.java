package com.example.designpatterns.behavioral.strategy;

public class Student {

    private EnumSection section;

    private ExamStrategy examStrategy;

    public Student(EnumSection section) {
        this.section = section;

        if(section == null) {
            throw new NullPointerException("Bolum boş olamaz! ");
        }

        switch (section) {
            case SOZEL:
                examStrategy = new VerbalStrategy();
                break;
            case ESITAGIRLIK:
                examStrategy = new EqualWeightStrategy();
                break;
            case SAYISAL:
                examStrategy = new NumericalStrategy();
                break;

            default:
                break;
        }
    }

    public String getPriorityOrder(){
        System.out.println(section + " için strateji: ");
        String arrangement = "Önce " + examStrategy.getFirst() + " çöz. \n" +
                "Sonra " + examStrategy.getSecond() + " çöz. \n"+
                "Daha Sonra " + examStrategy.getThird() + " çöz. \n"+
                "Zaman kalırsa " + examStrategy.getFourth() + " çözersin. \n";

        return arrangement;
    }
}
