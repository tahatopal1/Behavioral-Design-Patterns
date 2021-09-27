package State;

public class Attack implements Console {

    @Override
    public void pressSquare() {
        System.out.println("Shoot!");
    }

    @Override
    public void pressTriangle() {
        System.out.println("Deep pass.");
    }

    @Override
    public void pressCircle() {
        System.out.println("High pass.");
    }

    @Override
    public void pressCross() {
        System.out.println("Short pass.");
    }
}
