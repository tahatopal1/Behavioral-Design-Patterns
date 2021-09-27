package Iterator.Old;

public class Fascicle {

    private String name;
    private Question[] questions;

    public Fascicle(String name) {
        this.name = name;
        this.questions = new Question[10];

        for (int i = 0; i < 10; i++){
            questions[0] = new Question((long) (i + 6));
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
}
