public class Student extends Person implements Learner{

    private String studentId;
    private String major;

    public Student(String name, int age, String favColor, String studentID, String major) throws  InvalidStudentException {
        super(name, age, favColor);
        if(name == null || age < 0 || favColor == null) {
            throw new InvalidStudentException("Invalid input: Name cannot be null; age cannot be less than 0; Favorite " +
                    "color can not be null");
        }
        this.studentId = studentID;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void introduceSelf() {
        System.out.println("Hello my name is " + this.getName() + ". I am " + this.getAge() + " years old " +
                "and my favorite color is " + this.getFavoriteColor() + ". My student ID is " + getStudentId() +
                ". My major is " + getMajor());
    }

    @Override
    public void study() {
        System.out.println("Studying " + this.getMajor());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= '" + this.getName() + '\'' +
                "studentId='" + studentId + '\'' +
                ", major='" + major + '\'' +
                ", age='" + this.getAge() + '\'' +
                ", favoriteColor='" + this.getFavoriteColor() + '\'' +
                '}';
    }
}
