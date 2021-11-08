package com.example.designpatterns.structural.decorator;

public class StripedReportDecorator extends  ReportDecorator{

    public StripedReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getText() {

        String text = super.getText();

        String stripedText = ReportUtil.getStripedText(text);

        return stripedText;
    }
}
