package Interpreter;

public class BirdInterpreter implements Interpreter {
    @Override
    public String interpret(String word) {
        BirdLang birdLang = new BirdLang();
        String translated = birdLang.translateToEnglish(word);
        return translated;
    }
}
