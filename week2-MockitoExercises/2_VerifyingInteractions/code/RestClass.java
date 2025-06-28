package org.example;

public class RestClass {
    public String getData() {
        return "Hello from RestClass!";
    }

    public String postData(String data) {
        return "Received data: " + data;
    }

    public String putData(String data) {
        return "Updated data to: " + data;
    }

    public String deleteData(String data) {
        return "Deleted data: " + data;
    }
}
