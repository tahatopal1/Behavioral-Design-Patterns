package Chain.Branch;

import Chain.CargoCompany;
import Chain.City;
import Chain.PrvtCargo;

public class App {
    public static void main(String[] args) {

        CargoCompany prvCargo = PrvtCargo.getCargoCompany();

        System.out.println("*********** SHIPMENT FOR LONDON *********");
        prvCargo.ship(City.LONDON);
        System.out.println("*********** ********* *********");

        System.out.println("*********** SHIPMENT FOR LONDON *********");
        prvCargo.ship(City.BERLIN);
        System.out.println("*********** ********* *********");

        System.out.println("*********** SHIPMENT FOR LONDON *********");
        prvCargo.ship(City.MADRID);
        System.out.println("*********** ********* *********");

    }
}
