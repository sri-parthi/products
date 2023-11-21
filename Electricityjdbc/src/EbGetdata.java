import java.sql.*;
public class EbGetdata {
	public static void geteb()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/eb";
		String username="root";
		String password="#sri@519@p712";
		String Query="select * from ebtab"; 
		Connection con=DriverManager.getConnection(url,username,password);
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery(Query);
		while(rs.next())
		{
			System.out.println("si_no :"+rs.getInt(1));
			System.out.println("ebcardno:"+rs.getInt(2));
			System.out.println("consumer name :"+rs.getString(3));
			System.out.println("Address:"+rs.getString(4));
			System.out.println("old reading:"+rs.getInt(5));
			System.out.println("new reading :"+rs.getInt(6));
			System.out.println("unit:"+rs.getInt(7));
			System.out.println("freeunit :"+rs.getInt(8));
			System.out.println("total unit:"+rs.getInt(9));
			System.out.println("pre unit :"+rs.getInt(10));
			System.out.println("amount:"+rs.getInt(11));
		}
			con.close();	
		}
		
	public static void main(String[] args)throws Exception{
		geteb();		

	}

}
