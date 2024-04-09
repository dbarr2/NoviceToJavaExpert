abstract class OnlineStudent extends Student{


    public OnlineStudent(String name, int age, String favColor, String studentID, String major)
            throws InvalidStudentException {
        super(name, age, favColor, studentID, major);
    }

    @Override
    public void study() {
        System.out.println("This student is studying online");
    }
    abstract void attendVirtualClass();

}
