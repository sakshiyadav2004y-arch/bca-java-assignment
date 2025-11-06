Import java.sql.*;

public class JDBCInsert {
    public static void main(String[] args) {
        try {
            // Step 1: Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "yourpassword");

            System.out.println("Connection Successful!");

            // Step 3: Create a PreparedStatement
            String query = "INSERT INTO students (name, rollno) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            // Step 4: Add one hard-coded record
            ps.setString(1, "Sakshi Yadav");
            ps.setInt(2, 101);

            // Step 5: Execute the SQL command
            ps.executeUpdate();
            System.out.println("Record Inserted!");

            // Step 6: Close the connection
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}