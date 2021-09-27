package Mediator;

import java.math.BigDecimal;

public abstract class Producer {

    private String name;
    private BigDecimal cost;
    private Product product;

    private Mediator mediator;

    public Producer(String name, BigDecimal cost, Product product, Mediator mediator) {
        this.name = name;
        this.cost = cost;
        this.product = product;
        this.mediator = mediator;
    }

    public void sellProduct(){
        mediator.receiveFromProducer(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
