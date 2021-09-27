package Mediator;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        Mediator mediator = new Middleman();

        TomatoProducer tomatoProducerJack = new TomatoProducer("Jack", BigDecimal.valueOf(4), mediator);
        TomatoProducer tomatoProducerJohn = new TomatoProducer("John", BigDecimal.valueOf(3), mediator);

        TomatoSaler tomatoSalerJoseph = new TomatoSaler("Joseph", BigDecimal.valueOf(5), mediator);
        TomatoSaler tomatoSalerTom = new TomatoSaler("Tom", BigDecimal.valueOf(6), mediator);

        mediator.addProducer(tomatoProducerJack);
        mediator.addProducer(tomatoProducerJohn);

        mediator.addSaler(tomatoSalerJoseph);
        mediator.addSaler(tomatoSalerTom);

        tomatoProducerJack.sellProduct();
        tomatoSalerTom.buyProduct();

    }
}
