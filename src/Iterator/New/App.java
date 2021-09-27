package Iterator.New;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {

        Book book = new Book("Maths");
        Fascicle fascicle = new Fascicle("Biology");

        Iterator qIterator = book.getQuestionIterator();
        print(qIterator);

        qIterator = fascicle.getQuestionIterator();
        print(qIterator);


    }

    private static void print(Iterator qIterator) {
        while (qIterator.hasNext()) {
            Question question = (Question) qIterator.next();
            Long questionNo = question.getqNo();
            System.out.println("Question Number: " + questionNo);
        }
    }
}
