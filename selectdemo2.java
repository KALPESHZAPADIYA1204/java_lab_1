import java.sql.*;
public class selectdemo
{
    public static void main(String args[])
    {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        String url="jdbc:mysql://localhost:3306/company";
        try
        {
            conn=DriverManager.getConnection(url, "root", "tnrao");
            stmt=conn.createStatement();
            String sql="select * from emp where empno>2";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                String fnm=rs.getString(2);
                String lnm=rs.getString(3);
                String desg=rs.getString(4);
                System.out.println("FName:"+fnm);
                System.out.println("LName:"+lnm);
                System.out.println("desg:"+desg);
            }
            rs.close();
            stmt.close();
            conn.close();
          

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


}
