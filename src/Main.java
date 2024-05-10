import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws InvalidStudentException {

        Person newMe = new Person("Deangelo", 25);

        newMe.celebrateBirthday();
        newMe.introduceSelf();

        Student student1 = new Student("John" , 24,"Com Sci");
        student1.introduceSelf();
        student1.study();
        student1.celebrateBirthday();
        student1.introduceSelf();

        ArrayList<Student> people = new ArrayList<>();
        Student studentA = new Student("Jessy" , 23,"Communications");
        Student studentB = new Student("Jacob" , 56,"Business");
        Student studentC = new Student("Han" , 19,"Art");
        Student studentD = new Student("Patty" , 40,"History");

        people.add(studentA);
        people.add(studentB);
        people.add(studentC);
        people.add(studentD);

        for(Student student : people) {
            System.out.println(student + " ");
        }

        /**
         *  Create a HashSet that stores Strings representing unique courses
         *  (e.g., "Java", "Data Structures", "Algorithms"). Show how duplicates are handled by
         *  trying to add duplicate values.
         */
        HashSet<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("Data Structures");
        courses.add("Algorithms");
        courses.add("Computer Organization");
        courses.add("Simulation");
        courses.add("Calculus");
        courses.add("Robotics");
        courses.add("Java"); //  This is just for exercise purposes. I am seeing how hashsets handle duplicate values

        for(String item : courses) {
            System.out.println(item);
        }

        /**
         * Create a HashMap where the key is a String representing a student's name, and the value is an ArrayList of
         * Strings representing the courses they're taking. Populate the map with some data and demonstrate how to iterate over the map
         * to display each student's courses.
         */

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> schedule = new ArrayList<>();
        schedule.add("Computer Org");
        schedule.add("Simulation");
        schedule.add("Software Development");
        map.put("John", schedule);



        ArrayList<String> scheduleB = new ArrayList<>();
        scheduleB.add("Japanese");
        scheduleB.add("History");
        scheduleB.add("Intro to Women Studies");
        map.put("Jane", scheduleB);

        //Print the details of the map
        System.out.println("Courses taken by each student" + map);


        //Test using the custom exception handling class
        try {
            Student mike = new Student("", 22, "Com Sci");
        } catch (InvalidStudentException e) {
            System.out.println(e);
        }



        //Take the students in the "people" arraylist and print them to a file and read from that file
        /**
         * Typically this would not happen but for the sake of the exercise I placed this code here
         */
        try {
            System.out.println("Creating File -------->");
            File myFile = new File("studentRecords.txt");
            FileWriter writer = new FileWriter(myFile);
            for(Student item : people) {
                writer.write(item.getName() + ":" + item.getMajor() + "\n");
            }
            writer.close();
            System.out.println("Reading from file and printing to the console ---------");
            try {
                Scanner sc = new Scanner(myFile);
                while(sc.hasNextLine()) {
                    String data = sc.nextLine();
                    System.out.println(data);
                }
                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("File does not exist");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

        DistanceLearner distanceLearner = new DistanceLearner("Noah", 45,"Business");
        distanceLearner.introduceSelf();


        //Create a connection to the sql database
        DatabaseHelper db = new DatabaseHelper("jdbc:mysql://127.0.0.1:3306/studentrepository?useSSL=false&characterEncoding=UTF-8&allowPublicKeyRetrieval=true", "user", "pw");
        System.out.println(db.toString());
        try {
            db.getConnection();
            //db.insertStudent(1,"Daniel", 22, "Computer Science");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

       /**try {
            List<Student> allStudents = db.fetchAllStudents();

            for(Student item : allStudents) {
                System.out.println(item.getAge());
                System.out.println(item.getName());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        **/

        try {
            db.processMultipleTransactions(people);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
