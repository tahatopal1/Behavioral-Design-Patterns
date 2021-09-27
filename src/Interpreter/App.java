package Interpreter;

public class App {
    public static void main(String[] args) {
        String word = "Inpeepterpeepprepeepter Depeepigpeepgn Papeepttpeeperpeepn";
        BirdInterpreter birdInterpreter = new BirdInterpreter();
        String actualWord = birdInterpreter.interpret(word);
        System.out.println(actualWord);
    }
}
