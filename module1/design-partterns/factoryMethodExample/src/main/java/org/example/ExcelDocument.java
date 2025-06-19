package org.example;

public class ExcelDocument extends Document {

    public ExcelDocument(String title, String content) {
        super(title, content, "Excel");
    }

    @Override
    public void printDocument() {
        System.out.println("Excel: " + getTitle());
        System.out.println("Content: " + getContent());
    }
}
