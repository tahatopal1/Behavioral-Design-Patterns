package Chain;

public abstract class CargoCompany {

    private City city;
    private CargoCompany nextCargoCompany;

    public CargoCompany(City city) {
        this.city = city;
    }

    public void ship(City city){

        printDeliveryInfo(city);

        if (getCity().equals(city))
            printCargoInfo();
        else if (getNextCargoCompany() != null)
            getNextCargoCompany().ship(city);
        else
            notSuitableForServiceInfo();
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public CargoCompany getNextCargoCompany() {
        return nextCargoCompany;
    }

    public CargoCompany setNextCargoCompany(CargoCompany nextCargoCompany) {
        this.nextCargoCompany = nextCargoCompany;
        return this;
    }

    public void notSuitableForServiceInfo() {
        System.out.println("Cargo is not suitable for service.");
    }

    public void printDeliveryInfo(City city) {
        System.out.println("Cargo for city of " + city.getCity() + " is on " + getCity() + " right now!");
    }

    public void printCargoInfo() {
        System.out.println(getCity().getCity() + " branch has received the cargo.");
    }
}
