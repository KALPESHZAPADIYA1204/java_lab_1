import java.sql.*;
public class Pdelete{
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String url = "jdbc:mysql://localhost:3306/company";

        try {
        
            conn = DriverManager.getConnection(url,"root","tnrao");
             String sql = "DELETE FROM emp WHERE Firstname = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "kalpesh");
            int val = pstmt.executeUpdate();
             System.out.println(val + " record deleted successfully");

            pstmt.close();
            conn.close();
        } 
        catch (Exception e)
         {
            e.printStackTrace();
        }
    }
}
