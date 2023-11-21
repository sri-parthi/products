import java.sql.*;
public class Ebupdate {
	public static void update()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/eb";
		String username="root";
		String password="#sri@519@p712";
		String Query="update ebtab set consumername='mubina' where si_no=6";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[] args)throws Exception {
		update();		

	}

}
