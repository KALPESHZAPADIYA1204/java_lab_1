import java.sql.*;
public class pinsert
{
    public static void main(String args[])
    {
        Connection conn=null;
        Statement stmt=null;
        String url="jdbc:mysql://localhost:3306/company";
        try
        {
            conn=DriverManager.getConnection(url, "root", "tnrao");
            stmt=conn.createStatement();
            String sql="insert into emp values(3,'ranjit','saliya','developer')";
            int val=stmt.executeUpdate(sql);
            System.out.println(val+"records insert successfully");
            stmt.close();
            conn.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


}
