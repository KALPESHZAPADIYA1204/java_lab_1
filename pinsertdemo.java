import java.sql.*;
public class pinsertdemo
{
	public static void main(String[] args) 
	{
        Connection conn = null;
        
 
 	String url = "jdbc:mysql://localhost:3306/company";
        try 
	{
            conn = DriverManager.getConnection(url,"root","tnrao");

            String sql ="insert into emp values(?,?,?,?)";
            PreparedStatement pt = conn.prepareStatement(sql);
            pt.setInt(1,4);
	    pt.setString(2,"mahesh");
	    pt.setString(3,"rabadiya");
	    pt.setString(4,"teacher");

	    int val=pt.executeUpdate();
	if(val>0)
	{

            System.out.println("record inserted successfully");
           }
            pt.close();
            conn.close();
        }  
	catch (Exception e) 
	{
            
            e.printStackTrace();
        }   
	}
}