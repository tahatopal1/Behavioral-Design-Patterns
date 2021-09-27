package Iterator.Old;

import java.util.List;

public class App {
    public static void main(String[] args) {

        Book book = new Book("Maths");
        List<Question> bookQuestions = book.getQuestions();
        print(bookQuestions);

        Fascicle fascicle = new Fascicle("Biology");
        Question[] fascicleQuestions = fascicle.getQuestions();
        print(fascicleQuestions);

    }

    private static void print(Question[] fascicleQuestions) {
        for (Question bookQuestion : fascicleQuestions) {
            Long qNo = bookQuestion.getqNo();
            System.out.println("Question number: "+ qNo);
        }
    }

    private static void print(List<Question> bookQuestions) {
        for (Question bookQuestion : bookQuestions) {
            Long qNo = bookQuestion.getqNo();
            System.out.println("Question number: "+ qNo);
        }
    }


}
