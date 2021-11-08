package com.example.designpatterns.structural.decorator;

public class ReportApp {
    public static void main(String[] args) {

        String contents = getReportContents();

        // String text = plainReport.getText();

        // String text = stripedReportOutput(contents);

        // String text = stripedSmallReportOutput(contents);

        String text = stripedSignedReportOutput(contents);

        System.out.println(text);

    }

    private static String stripedSignedReportOutput(String contents){

        PlainReport plainReport = new PlainReport(contents);

        StripedReportDecorator stripedReportDecorator = new StripedReportDecorator(plainReport);

        SignedReportDecorator signedReportDecorator = new SignedReportDecorator(stripedReportDecorator);

        return signedReportDecorator.getText();
    }

    private static String stripedSmallReportOutput(String contents) {

        PlainReport plainReport = new PlainReport(contents);

        StripedReportDecorator stripedReportDecorator = new StripedReportDecorator(plainReport);

        SmallReportDecorator smallReportDecorator = new SmallReportDecorator(stripedReportDecorator);

        return smallReportDecorator.getText();
    }

    private static String stripedReportOutput(String contents) {

        PlainReport plainReport = new PlainReport(contents);

        StripedReportDecorator stripedReportDecorator = new StripedReportDecorator(plainReport);

        return stripedReportDecorator.getText();

    }

    private static String plainReportOutput(String contents) {

        PlainReport plainReport = new PlainReport(contents);

        return plainReport.getText();
    }

    private static String getReportContents() {

        String contents = "Extending a class is the first thing that " +
                "\ncomes to mind when you need to alter an object’s " +
                "\nbehavior. However, inheritance has several serious" +
                "\ncaveats that you need to be aware of.\n \n" +
                "\nInheritance is static. You can’t alter the behavior of" +
                "\nan existing object at runtime. You can only replace the" +
                "\nwhole object with another one that’s created from a " +
                "\ndifferent subclass.\n Subclasses can have just one " +
                "\nparent class. In most languages, inheritance doesn’t " +
                "\nlet a class inherit behaviors of multiple classes at" +
                "\nthe same time.";

        return contents;
    }
}
