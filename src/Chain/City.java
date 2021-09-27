package Chain;

public enum City {
    ISTANBUL("Istanbul"),
    PARIS("Paris"),
    LONDON("London"),
    BERLIN("Berlin"),
    ROME("Rome"),
    MADRID("Madrid");

    private String city;

    City(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return city;
    }
}
