package Strategy;

public class LiteratureStudentStrategy implements ExamStrategy {
    @Override
    public Lesson getFirst() {
        return Lesson.LITERATURE;
    }

    @Override
    public Lesson getSecond() {
        return Lesson.SOCIALS;
    }

    @Override
    public Lesson getThird() {
        return Lesson.MATHS;
    }

    @Override
    public Lesson getFourth() {
        return Lesson.SCIENCE;
    }
}
