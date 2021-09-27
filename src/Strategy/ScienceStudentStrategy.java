package Strategy;

public class ScienceStudentStrategy implements ExamStrategy {
    @Override
    public Lesson getFirst() {
        return Lesson.MATHS;
    }

    @Override
    public Lesson getSecond() {
        return Lesson.SCIENCE;
    }

    @Override
    public Lesson getThird() {
        return Lesson.LITERATURE;
    }

    @Override
    public Lesson getFourth() {
        return Lesson.SOCIALS;
    }
}
