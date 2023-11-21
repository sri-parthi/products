import java.sql.*;
public class Eb {
	public static void insert()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/eb";
		String username="root";
		String password="#sri@519@p712";
		String Query="insert into ebtab values(?,?,?,?,?,?,?,?,?,?,?)";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(1, 1);
		pst.setInt(2,5478);
		pst.setString(3, "sri");
		pst.setString(4, "chennai");
		pst.setInt(5,120);
		pst.setInt(6,250);
		pst.setInt(7,130);
		pst.setInt(8,100);
		pst.setInt(9,30);
		pst.setInt(10,6);
		pst.setInt(11,180);
		pst.executeUpdate();
		con.close();
		

	}

	public static void main(String[] args)throws Exception {
		insert();
		

	}

}
