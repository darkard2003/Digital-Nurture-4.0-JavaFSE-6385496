package org.example;

abstract public class DocumentFactory {
    public static Document createDocument(String type, String title, String content) {
        switch (type.toUpperCase()) {
            case "PDF":
                return new PDFDocument(title, content);
            case "WORD":
                return new WordDocument(title, content);
            case "EXCEL":
                return new ExcelDocument(title, content);
            default:
                return null;
        }
    }
}
