package Mediator;

import java.math.BigDecimal;

public class TomatoProducer extends Producer {
    public TomatoProducer(String name, BigDecimal cost, Mediator mediator) {
        super(name, cost, Product.TOMATO, mediator);
    }
}
