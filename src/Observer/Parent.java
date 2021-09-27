package Observer;

public class Parent implements Observer {

    private String name;

    public Parent(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable) {
        Thermometer thermometer = (Thermometer) observable;
        System.out.println(name + " says that: temperature shows that it is "
                                        + thermometer.getInstantTemperature() + " celcius");
    }
}
