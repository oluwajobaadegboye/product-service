package edu.cs.mum.gdmstore.productservice.model;

import java.util.List;

public class Response {
     private String responseCode;
     private String responseMessage;
     private List<Product> products;

    public Response() {
    }

    public Response(String responseCode, String responseMessage, List<Product> products) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.products = products;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
