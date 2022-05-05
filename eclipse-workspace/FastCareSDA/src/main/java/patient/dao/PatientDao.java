package patient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import patient.bean.PatientBean;


public class PatientDao {

    public int registerPatient(PatientBean User) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO PatientData" +
            "  (ID, username, passcode, location, emailAddress) VALUES  " +
            " (?, ?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/Patients_FastCare?useSSL=false", "abdullah", "123456");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
        	
            preparedStatement.setString(1, User.getID());
            preparedStatement.setString(2, User.getUsername());
            preparedStatement.setString(3, User.getPasscode());
            preparedStatement.setString(4, User.getLocation());
            preparedStatement.setString(5, User.getEmailAddress());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}