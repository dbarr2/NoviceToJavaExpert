public class DistanceLearner extends OnlineStudent{


    public DistanceLearner(String name, int age, String major) throws InvalidStudentException {
        super(name, age, major);
    }

    @Override
    void attendVirtualClass() {
        System.out.println("The student attends online class");
    }
}
