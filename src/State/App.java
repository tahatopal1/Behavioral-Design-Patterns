package State;

public class App {

    public static void main(String[] args) {

        Game game = new Game();

        game.cross();
        game.triangle();
        game.square();
        game.loseTheBall();

        game.cross();
        game.square();
        game.getTheBall();



    }

}
