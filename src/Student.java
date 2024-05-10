public class Student extends Person implements Learner{

    private int studentId;
    private String major;

    public Student(String name, int age, String major) throws  InvalidStudentException {
        super(name, age);
        if(name == null || age < 0) {
            throw new InvalidStudentException("Invalid input: Name cannot be null; age cannot be less than 0; Favorite " +
                    "color can not be null");
        }
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void introduceSelf() {
        System.out.println("Hello my name is " + this.getName() + ". I am " + this.getAge() + " years old " +
                ". My major is " + getMajor());
    }

    @Override
    public void study() {
        System.out.println("Studying " + this.getMajor());
    }

    @Override
    public void takeExam(String subject) {
        System.out.println(this.getName() + " is taking an exam in " + subject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= '" + this.getName() + '\'' +
                ", major='" + major + '\'' +
                ", age='" + this.getAge() + '\'' +
                '}';
    }
}
