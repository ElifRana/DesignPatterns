package com.example.designpatterns.structural.decorator;

public class SmallReportDecorator extends ReportDecorator{

    private int width;

    public SmallReportDecorator(Report report) {
        super(report);
        this.width = 30;
    }

    @Override
    public String getText() {

        String text = super.getText();

        String smallText = ReportUtil.fitText(text, width);

        return smallText;
    }
}
