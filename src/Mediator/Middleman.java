package Mediator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Middleman implements Mediator {

    private List<Producer> producers;
    private List<Saler> salers;

    public Middleman() {
        producers = new ArrayList<Producer>();
        salers = new ArrayList<Saler>();
    }

    @Override
    public void addProducer(Producer producer) {
        producers.add(producer);
    }

    @Override
    public void addSaler(Saler saler) {
        salers.add(saler);
    }

    @Override
    public void receiveFromProducer(Producer producer) {
        Saler saler = findSuitableSaler(producer.getProduct());
        sell(producer, saler);
    }

    @Override
    public void sellToSaler(Saler saler) {
        Producer producer = findSuitableProducer(saler.getProduct());
        sell(producer, saler);
    }

    private Producer findSuitableProducer(Product product) {

        Producer suitableProducer = null;

        for (Producer producer: producers){
            if (product.equals(producer.getProduct())){
                BigDecimal producerCost = producer.getCost();
                if (suitableProducer == null || suitableProducer.getCost().compareTo(producerCost) > 0)
                    suitableProducer = producer;
            }
        }

        return suitableProducer;

    }

    private Saler findSuitableSaler(Product product) {

        Saler suitableSaler = null;

        for (Saler saler: salers){
            if (product.equals(saler.getProduct())){
                BigDecimal salerCost = saler.getCost();
                if (suitableSaler == null || suitableSaler.getCost().compareTo(salerCost) < 0)
                    suitableSaler = saler;
            }
        }

        return suitableSaler;
    }

    private void sell(Producer producer, Saler saler) {
        System.out.println(producer.getProduct().getProductName()
                + " was sold by " + producer.getName() + " to " + saler.getName());
    }
}
