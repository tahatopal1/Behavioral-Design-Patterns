package Strategy;

public enum Lesson {

    LITERATURE("Literature"),
    MATHS("Maths"),
    SCIENCE("Science"),
    SOCIALS("Socials");

    private String lesson;

    Lesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return lesson;
    }
}
