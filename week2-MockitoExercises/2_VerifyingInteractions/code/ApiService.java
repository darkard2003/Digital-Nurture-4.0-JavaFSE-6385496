package org.example;

public class ApiService {
    private RestClass restClass;
    public ApiService(RestClass restClass) {
        this.restClass = restClass;
    }

    public String fetchData() {
        return restClass.getData();
    }

    public String sendData(String data) {
        return restClass.postData(data);
    }

    public String updateData(String data) {
        return restClass.putData(data);
    }

    public String removeData(String data) {
        return restClass.deleteData(data);
    }
}
