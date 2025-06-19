package org.example;

public class PDFDocument extends  Document {
    public PDFDocument(String title, String content) {
        super(title, content, "PDF");
    }

    @Override
    public void printDocument() {
        System.out.println("PDF: " + getTitle());
        System.out.println("Content: " + getContent());
    }
}
