package Iterator.New;

import java.util.Iterator;

public class QuestionIterator implements Iterator {

    private Question[] questions;
    private int index;

    public QuestionIterator(Question[] questions) {
        this.questions = questions;
    }

    @Override
    public boolean hasNext() {
        return index < questions.length;
    }

    @Override
    public Object next() {
        Question question = questions[index++];
        return question;
    }
}
