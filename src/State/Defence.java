package State;

public class Defence implements Console {

    @Override
    public void pressSquare() {
        System.out.println("Soft tackle.");
    }

    @Override
    public void pressTriangle() {
        System.out.println("Release goalkeeper.");
    }

    @Override
    public void pressCircle() {
        System.out.println("Hard tackle.");
    }

    @Override
    public void pressCross() {
        System.out.println("Marking attacker.");
    }
}
