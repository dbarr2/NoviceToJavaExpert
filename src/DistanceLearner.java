public class DistanceLearner extends OnlineStudent{


    public DistanceLearner(String name, int age, String favColor, String studentID, String major) throws InvalidStudentException {
        super(name, age, favColor, studentID, major);
    }

    @Override
    void attendVirtualClass() {
        System.out.println("The student attends online class");
    }
}
