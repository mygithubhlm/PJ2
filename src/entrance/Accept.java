package entrance;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;

public class Accept {
	public static void input(String name,String number,String password1,String hobby,String sex,String email) throws SQLException {
		//加载jdbc
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("error when loading jdbc");
					e.printStackTrace();
				}
				//链接数据库
				String url = "jdbc:mysql://localhost:3306/lab8?characterEncoding=utf8";
				String username = "root";
				String password = "";
				java.sql.Connection con = null;
				try {
					con = DriverManager.getConnection(url,username,password);
				} catch (SQLException se) {
					// TODO Auto-generated catch block
					System.out.println("error when connecting database");
					se.printStackTrace();
				}
				//插入新用户
					String sql1 = "INSERT INTO `lab8`.`login`(`NAME`,`NUMBER`,`PASSWORD`,`HOBBY`,`SEX`,`EMAIL`) VALUES ('" + name +
							"','" + number + "','" + password1 + "','" + hobby + "','" + sex + "','" + email + "')";
					java.sql.Statement stm = con.createStatement();
					stm.executeUpdate(sql1);
//					String sql2 = "UPDATE `login` set NUMBER='" + number + "' where PASSWORD='" + password1 + "'" ;
//					stm.executeUpdate(sql2);
	}
	public static String prove(String number1,String password1) throws SQLException{
		//加载jdbc
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error when loading jdbc");
			e.printStackTrace();
		}
		//链接数据库
		String url = "jdbc:mysql://localhost:3306/lab8";
		String username = "root";
		String password = "";
		java.sql.Connection con = null;
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			System.out.println("error when connecting database");
			se.printStackTrace();
		}
		//使用带有条件的查询
		
			int i = 0;
			String sql2="SELECT * FROM `login`";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql2); 
			while(rs.next()){
				String number2 = rs.getString("NUMBER");
				String password2 = rs.getString("PASSWORD");
				//test
				//System.out.println(number1);
				//System.out.println(password1);
				//System.out.println(number2);
				//System.out.println(password2);
				if (number2.equals(number1)){
					if(password2.equals(password1)){
						i = -1;
						return "t";
					}
				}
				else{
					if (i == 0)
						i = 1;
				}
			}
			if (i == 1){
				return "wrong";
			}
			else{
				return "f";
			}
	}
}
