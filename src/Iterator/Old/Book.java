package Iterator.Old;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String name;
    private List<Question> questions;

    public Book(String name) {
        this.name = name;
        this.questions = new ArrayList<>();

        questions.add(new Question(1L));
        questions.add(new Question(2L));
        questions.add(new Question(3L));
        questions.add(new Question(4L));
        questions.add(new Question(5L));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
