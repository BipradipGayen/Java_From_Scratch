import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException{
        String url ="jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String paswd = "root";
        String query = "SELECT * FROM employees";
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Drivers loaded successfully");
//
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.getMessage());
//        }

        try{
            Connection con = DriverManager.getConnection(url,username,paswd);
            System.out.println("DB connection established");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String jd = rs.getString("JOB");
                double salary = rs.getDouble("salary");
                System.out.println();
                System.out.println("==================");
                System.out.println("ID " + id);
                System.out.println("Name " + name);
                System.out.println("Job title " + jd);
                System.out.println("Salary " + salary);



            }
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}