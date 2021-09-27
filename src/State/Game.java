package State;

public class Game {

    private Console console;

    public Game() {
        System.out.println("Game has started");
        console = new Attack();
    }

    public void triangle(){
        console.pressTriangle();
    }

    public void square(){
        console.pressSquare();
    }

    public void circle(){
        console.pressCircle();
    }

    public void cross(){
        console.pressCross();
    }

    public void getTheBall(){
        System.out.println("We got the ball. Prepare to attack!");
        console = new Attack();
    }

    public void loseTheBall(){
        System.out.println("We've lost ball. Fall back to defence!");
        console = new Defence();
    }


}
