package Interpreter;

public enum Language {

    BIRD("Bird", "peep"),
    CROW("Crow", "caw");

    private String name;
    private String prefix;

    Language(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }
}
