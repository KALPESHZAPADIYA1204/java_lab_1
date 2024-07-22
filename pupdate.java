import java.sql.*;
public class pupdate{
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String url = "jdbc:mysql://localhost:3306/company";

        try {
        
            conn = DriverManager.getConnection(url,"root","tnrao");
             String sql = "update emp set Lname=? where Fname=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "rohit");
            pstmt.setString(2, "sharma");
            int val = pstmt.executeUpdate();
             System.out.println(val + " record update successfully");

            pstmt.close();
            conn.close();
        } 
        catch (Exception e)
         {
            e.printStackTrace();
        }
    }
}