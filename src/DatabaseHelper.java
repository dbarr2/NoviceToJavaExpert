import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper {

    private String jdbcURL;
    private String username;
    private String password;

    public DatabaseHelper(String jdbcURL, String username, String password) {
        this.jdbcURL = jdbcURL;
        this.username = username;
        this.password = password;
    }

    // Code to establish and return a JDBC connection
    public Connection getConnection() throws SQLException{
        //  setSSLProtocol();
        // No longer need to explicitly load the driver class in JDBC 4.0 and above
        // DriverManager will automatically load the driver from your classpath
        return DriverManager.getConnection(this.jdbcURL, this.username, this.password);
    }

    public void insertStudent(int student_id, String name, int age, String major) throws SQLException {
        String query = "INSERT INTO students (student_id, student_name, age, major ) VALUES (?, ?, ?, ?)";
        Connection con = DriverManager.getConnection(this.jdbcURL, this.username, this.password);
        try(PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, student_id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            pstmt.setString(4, major);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("A student was inserted successfully");
            }
        } catch (SQLException e) {
            System.err.println("Error inserting student into database");
            e.printStackTrace();
        }
        con.close(); //close connection


    }

    public List<Student> fetchAllStudents() throws SQLException {
        //Set the query to select all the students from the database
        String query = "SELECT * FROM students";
        List<Student> students = new ArrayList<>();
        Connection con = DriverManager.getConnection(this.jdbcURL, this.username, this.password);

        try (PreparedStatement pstmt = con.prepareStatement(query) ; ResultSet rs = pstmt.executeQuery()) { //Create a prepared statement and result set instance to
            //process the data in the database

            //Process the result set
            while (rs.next()) {
                int studentId = rs.getInt("student_id");
                String studentName = rs.getString("student_name");
                int age = rs.getInt("age");
                String major = rs.getString("major");

                //Create a new Student object and add it to the list
                Student student = new Student(studentName, age, studentId, major);
                students.add(student);
            }
        } catch (InvalidStudentException e) {
            System.out.println("Error fetching students from database");
            e.printStackTrace();
        }

        con.close(); //close connection
        return students;
    }

    


}
