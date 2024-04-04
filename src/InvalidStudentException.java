public class InvalidStudentException extends Exception {

    //No arg constructior
    public InvalidStudentException() {
        super("Invalid student information provided");
    }

    public InvalidStudentException(String message) {
        super(message);
    }
}
