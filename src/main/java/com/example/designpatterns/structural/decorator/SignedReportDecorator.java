package com.example.designpatterns.structural.decorator;

public class SignedReportDecorator extends ReportDecorator{


    public SignedReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getText() {

        String text = super.getText();

        String signedText = ReportUtil.addSignedTextToEnd(text);

        return signedText;
    }
}
