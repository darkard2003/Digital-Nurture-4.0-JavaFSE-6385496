package org.example;

abstract class Document {
    private String title;
    private String content;
    private String type;

    public Document(String title, String content, String type) {
        this.title = title;
        this.content = content;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public abstract void printDocument();
}