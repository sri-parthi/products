import java.sql.*;
public class Ebdelete {
	public static void delete()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/eb";
		String username="root";
		String password="#sri@519@p712";
		String Query="delete from ebtab where si_no=11";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[] args)throws Exception {
		delete();
	}
	}


