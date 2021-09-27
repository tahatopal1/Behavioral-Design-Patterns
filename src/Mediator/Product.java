package Mediator;

public enum Product {

    TOMATO("Tomato"), CUCUMBER("Cucumber");

    private String productName;

    Product(String productName){
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
