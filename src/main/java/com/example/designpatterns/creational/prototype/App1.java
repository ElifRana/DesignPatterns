package com.example.designpatterns.creational.prototype;

import javax.print.Doc;
import java.util.Date;

public class App1 {

    public static void main(String[] args) {

        EntityService entityService = new EntityService();

        long id1 = 1L;

        Date firstDate = new Date();
        Document document1 = entityService.findDocumentById(id1);
        documentAndTimeDifference(firstDate, document1);

//        Date firstDate2 = new Date();
//        Document document2 = entityService.findDocumentById(id1);
//        documentAndTimeDifference(firstDate2, document2);

        Date firstDate3 = new Date();
        Document documentClone = null;

        try {
            documentClone = document1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        documentClone.setName("Günlük");
        documentClone.setData("Sevgili Günlük");
        documentClone.getDocumentType().setName("Kişisel 2");

        documentAndTimeDifference(firstDate3, documentClone);

        System.out.println(document1);


    }

    public static void documentAndTimeDifference(Date firstDate, Document document){
        Date lastDate = new Date();

        Long timeDifference = getTimeDifference(firstDate, lastDate);

        System.out.println(document);
        System.out.println(timeDifference);
    }

    private static Long getTimeDifference(Date firstDate, Date lastDate) {

        long has = 1000;
        long timeDifference = (lastDate.getTime() / has) - (firstDate.getTime() / has);
        return timeDifference;
    }
}
