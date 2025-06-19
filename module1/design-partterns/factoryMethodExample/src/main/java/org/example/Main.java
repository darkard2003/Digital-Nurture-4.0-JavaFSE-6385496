package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Document pdf = DocumentFactory.createDocument("PDF", "Demo PDF", "This is a sample PDF document.");
        Document word = DocumentFactory.createDocument("Word", "Demo Word", "This is a sample Word document.");
        Document excel = DocumentFactory.createDocument("Excel", "Demo Excel", "This is a sample Excel document.");

        pdf.printDocument();
        word.printDocument();
        excel.printDocument();
    }
}