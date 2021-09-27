package Strategy;

public class Student {

    private Division division;
    private ExamStrategy examStrategy;

    public Student(Division division) {
        this.division = division;

        if (division == null)
            throw new NullPointerException("Division cannot be null!");

        switch (division){
            case VERBAL:
                examStrategy = new LiteratureStudentStrategy();
                break;
            case MATHEMATICAL:
                examStrategy = new ScienceStudentStrategy();
                break;
            default: break;
        }

    }

    public String getPriorityOrder(){
        System.out.println("Strategy for " + division);
        String order = "1 - " + examStrategy.getFirst() + " \n" +
                "2 - " + examStrategy.getSecond() + " \n" +
                "3 - " + examStrategy.getThird() + " \n" +
                "4 - " + examStrategy.getFourth();
        return order;
    }

}
