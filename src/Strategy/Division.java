package Strategy;

public enum Division {

    VERBAL("Verbal"), MATHEMATICAL("Mathematical");

    private String division;

    Division(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return division;
    }
}
