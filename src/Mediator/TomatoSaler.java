package Mediator;

import java.math.BigDecimal;

public class TomatoSaler extends Saler {
    public TomatoSaler(String name, BigDecimal cost, Mediator mediator) {
        super(name, cost, Product.TOMATO, mediator);
    }
}
