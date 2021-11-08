package com.example.designpatterns.structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class ReportUtil {

    public static String getStripedText(String text) {

        String[] textList = text.split("\n");

        String stripedText = "";
        for (String eachLine : textList) {
            String stripedLine = addLineToLine(eachLine);
            stripedText = stripedText + stripedLine;
        }
        return stripedText;
    }

    private static String addLineToLine(String eachLine) {

        String newLine;

        if (eachLine.trim().length() == 0){
            newLine = "\n";
        }else {
            newLine = "\n- " + eachLine;
        }
        return newLine;
    }

    public static String fitText(String text, int width) {

        String smallLineText = "";

        String[] lineList = text.split("\n");

        for (String eachLine : lineList){

            if (eachLine.length() <= width){
                // aynen ekle
                smallLineText = addAndSwitchToNewLine(smallLineText, eachLine);
            }else  {
                //küçültüp ekle
                List<String> brokenList = smash(eachLine, width);

                for (String eachNewLine : brokenList) {
                    smallLineText = addAndSwitchToNewLine(smallLineText, eachNewLine);
                }
            }
        }

        return smallLineText;

    }

    private static String addAndSwitchToNewLine(String mainText, String textToBeAdded) {
        return mainText = textToBeAdded + "\n";
    }

    private static List<String> smash(String eachLine, int width) {

        List<String>  splitLineList = new ArrayList<>();

        for (int i = 0; i <= eachLine.length()/ 30; i++){
            int firstDigit = width * i;
            int lastDigit = firstDigit + width;

            if (lastDigit > eachLine.length()){
                lastDigit = eachLine.length();
            }
            String splitLine = eachLine.substring(firstDigit, lastDigit);

            if (splitLine.trim().length() > 0){
                splitLineList.add(splitLine);
            }
        }
        return splitLineList;
    }

    public static String addSignedTextToEnd(String text) {

        String signature = "\n\n + \t\t\t\t\t\t Signature : ";

        return text + signature;

    }
}
