package Mediator;

public interface Mediator {

    void addProducer(Producer producer);
    void addSaler(Saler saler);
    void receiveFromProducer(Producer producer);
    void sellToSaler(Saler saler);

}
