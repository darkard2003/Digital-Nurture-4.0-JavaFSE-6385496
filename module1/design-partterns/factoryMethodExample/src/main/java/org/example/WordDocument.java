package org.example;

class WordDocument extends Document {

    public WordDocument(String title, String content) {
        super(title, content, "Word");
    }

    @Override
    public void printDocument() {
        System.out.println("Word: " + getTitle());
        System.out.println("Content: " + getContent());
    }
}