package org.example;

public class Service {
    private  Repository repo;
    public Service(Repository repo) {
        this.repo = repo;
    }

    public String processData() {
        String data = repo.getData();
        return "Processed: " + data;
    }
}
