package dataBase;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.PreparedStatement;

public class Accept {
  static java.sql.Connection con = null;
	public static void Insert(String account,String password1,
			String email,String tel,String age,String qq,String pi,String name,String photourl) throws SQLException {
		//����jdbc
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error when loading jdbc");
			e.printStackTrace();
		}
		//������ݿ�
		String url = "jdbc:mysql://localhost:3306/fianl";
		String username = "root";
		String password = "hlm412725";
//		   
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			System.out.println("error when connecting database");
			se.printStackTrace();
		}

		//�������û�
		String sql1 = "INSERT INTO `dataBase`.`finaldb`(`account`,`password`,"
				+ "`email`,`tel`,`age`,`qq`,`pi`,`photourl`,`name`) VALUES ('"+account + "','" + password1 + "','" + email + "','" + tel + "','" 
				+ age  + "','" +qq+"','"+ name+"','" + photourl+ "')";
		Statement stm = con.createStatement();
		stm.executeUpdate(sql1);
		//		 Class.forName("com.mysql.jdbc.Driver");
		//		 java.sql.Connection conn = DriverManager.getConnection
		//("jdbc:mysql://localhost:3306/final","root","root");
		//�½���������������û����ǳ�,���������ڴ洢����û��������Լ���������
		//����Ϊ ʱ�䡢�������塢�������͡����±�ǩ�����±���
		String sql = "create table '" + name + "' (TIME  varchar(100)  primary key not null,"
				+ "ARTICLE text(5000) not null,STYLE varchar(20) not null,"
				+ "SIGN VARCHAR(100) not null,INPUT VARCHAR(100) not null);";
		//������֤
		//String sql4 = "INSERT INTO `" + name + "`(`TIME`,`ARTICLE`,`STYLE`)"  +
		//"VALUES('s','s','s');";
		// stm.executeUpdate(sql4);
		java.sql.PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.executeUpdate();

	}
	public static String prove(String number,String password1) throws SQLException{
		//����jdbc
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error when loading jdbc");
			e.printStackTrace();
		}
		//������ݿ�
		String url = "jdbc:mysql://localhost:3306/final";
		String username = "root";
		String password = "hlm412725";
		   
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			System.out.println("error when connecting database");
			se.printStackTrace();
		}
		//ʹ�ô��������Ĳ�ѯ

		int i = 0;
		String sql2="SELECT * FROM `finaldb`";
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql2); 
		while(rs.next()){
			String number1 = rs.getString("account");
			String password2 = rs.getString("password");
			if (number1.equals(number)){
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
	public static boolean see(String number) throws SQLException{
		//����jdbc
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error when loading jdbc");
			e.printStackTrace();
		}
		//������ݿ�
		String url = "jdbc:mysql://localhost:3306/final";
		String username = "root";
		String password = "hlm412725";
		   
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			System.out.println("error when connecting database");
			se.printStackTrace();
		}
		//ʹ�ô��������Ĳ�ѯ

		int i = 0;
		String sql3="SELECT * FROM `finaldb`";
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql3); 
		while(rs.next()){
			//			rs.last();
			String number1 = rs.getString("account");
			if (number1.equals(number)){
				return false;
				//˵�����ڴ��˺���
			}
			else{
				if (i == 0)
					i = 1;
			}
		}
		if (i == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean look(String name) throws SQLException{
		//����jdbc
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error when loading jdbc");
			e.printStackTrace();
		}
		//������ݿ�
		String url = "jdbc:mysql://localhost:3306/final";
		String username = "root";
		String password = "hlm412725";
		   
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			System.out.println("error when connecting database");
			se.printStackTrace();
		}
		//ʹ�ô��������Ĳ�ѯ

		int i = 0;
		String sql3="SELECT * FROM `finaldb`";
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql3); 
		while(rs.next()){
			String name1 = rs.getString("name");
			if (name1.equals(name)){
				return false;
				//˵�����ڴ��˺���
			}
			else{
				if (i == 0)
					i = 1;
			}
		}
		if (i == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public static String getInformation(String number) throws SQLException{
		//����jdbc
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error when loading jdbc");
			e.printStackTrace();
		}
		//������ݿ�
		String url = "jdbc:mysql://localhost:3306/final";
		String username = "root";
		String password = "";
		   
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			System.out.println("error when connecting database");
			se.printStackTrace();
		}
		//ʹ�ô��������Ĳ�ѯ

		int i = 0;
		String sql3="SELECT * FROM `finaldb`";
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql3); 
		while(rs.next()){
			//��ʱ�Ѿ�ȷ������ݿ���������˺�
			String number2 = rs.getString("account");
			if (number2.equals(number)){
				if ((rs.getString("SEX")).equals("1"))
					return "昵称:" +rs.getString("NAME")+"<br />�˺�:"
					+rs.getString("account")+"<br />����:"+
					rs.getString("HOBBY")+"<br />�Ա�:"
					+  "��"+"<br />�ʼ�:"+rs.getString("EMAIL");
				else
					return "�ǳ�:" +rs.getString("NAME")+"<br />�˺�:"
					+rs.getString("account")+"<br />����:"+
					rs.getString("HOBBY")+"<br />�Ա�:"
					+  "Ů"+"<br />�ʼ�:"+rs.getString("EMAIL");
			}
			else{
				if (i==0)
					i=1;
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		}
		if (i==1){
			return "wrong";
		}
		else{
			return "wrong";
		}
	}
	public static void changePassword(String number,String newPassword)
			throws SQLException{
		//����jdbc
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error when loading jdbc");
			e.printStackTrace();
		}
		//������ݿ�
		String url = "jdbc:mysql://localhost:3306/final";
		String username = "root";
		String password = "hlm412725";
		   
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			System.out.println("error when connecting database");
			se.printStackTrace();
		}
		//ʹ�ô��������Ĳ�ѯ

		int i = 0;
		String sql3="SELECT * FROM `finaldb`";
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql3); 
		while(rs.next()){
			//					rs.last();
			String number1 = rs.getString("account");
			if (number1.equals(number)){
				String sql1 = "UPDATE  `final`.`finaldb`  SET  `PASSWORD`= '"+
						newPassword + "' WHERE  account = '" + number + "'";
				java.sql.PreparedStatement pstmt = con.prepareStatement(sql1);
				pstmt.executeUpdate();
				//˵�����ڴ��˺���
			}
			else{
				if (i == 0)
					i = 1;
			}
		}
	}
	public static void changePhoto(String number,String photoUrl)
			throws SQLException{
		//����jdbc
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error when loading jdbc");
			e.printStackTrace();
		}
		//������ݿ�
		String url = "jdbc:mysql://localhost:3306/final";
		String username = "root";
		String password = "hlm412725";
		   
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			System.out.println("error when connecting database");
			se.printStackTrace();
		}
		//ʹ�ô��������Ĳ�ѯ

		int i = 0;
		String sql3="SELECT * FROM `finaldb`";
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql3); 
		while(rs.next()){
			//			rs.last();
			String number1 = rs.getString("account");
			if (number1.equals(number)){
				String sql1 = "UPDATE  `final`.`finaldb`  SET  `photourl`= '"+
						photoUrl + "' WHERE  account = '" + number + "'";
				java.sql.PreparedStatement pstmt = con.prepareStatement(sql1);
				pstmt.executeUpdate();
				//˵�����ڴ��˺���
			}
			else{
				if (i == 0)
					i = 1;
			}
		}
	}
	//---------------------------------------------------------------------------------------------------------
	//��	д���������֮�����ǿ��Գ�����JSP��ֱ�Ӷ��򵽲���������Ȼ����ʾ����ɹ�
	public static void inputArticle(String account,String time,String article,String style,String sign,String input)
			throws SQLException{		
		//����jdbc
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("error when loading jdbc");
					e.printStackTrace();
				}
				//������ݿ�
				String url = "jdbc:mysql://localhost:3306/final";
				String username = "root";
				String password = "hlm412725";
				con = null;   
				try {
					con = DriverManager.getConnection(url,username,password);
				} catch (SQLException se) {
					// TODO Auto-generated catch block
					System.out.println("error when connecting database");
					se.printStackTrace();
				}
//				String sql3="SELECT * FROM `finaldb`";
//				Statement stm = con.createStatement();
//				ResultSet rs = stm.executeQuery(sql3); 
//				String name="";
//				while(rs.next()){
//					//��ʱ�Ѿ�ȷ������ݿ���������˺�
//					String number2 = rs.getString("account");
//					if (number2.equals(account)){
//						name=rs.getString("name");
//					}
//				}
				//�������û�
//				System.out.println(name);
				String sql1 = "INSERT INTO `final`.`" +account +"`(`TIME`,`ARTICLE`,"
						+ "`STYLE`,`SIGN`,`INPUT`) VALUES ('" + time +
						"','" + article + "','" + style + "','" + sign + "','" + input +  "')";
				 
				Statement stm1 = con.createStatement();
				   stm1.executeUpdate(sql1);
	}
	public static void createStyle(String account,String style) throws SQLException{
		//����jdbc
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("error when loading jdbc");
					e.printStackTrace();
				}
				//������ݿ�
				String url = "jdbc:mysql://localhost:3306/final";
				String username = "root";
				String password = "hlm412725";
				   
				try {
					con = DriverManager.getConnection(url,username,password);
				} catch (SQLException se) {
					// TODO Auto-generated catch block
					System.out.println("error when connecting database");
					se.printStackTrace();
				}
				//ʹ�ô��������Ĳ�ѯ
//				String sql3="SELECT * FROM `finaldb`";
				String[] dd = style.split(",");
				int r = dd.length;
				for (int i =0;i<r;i++){
				String sql00 = "INSERT INTO `final`.`assort` (`usernumber`, `assort`) VALUES ('"+account+"', '"+dd[i]+"')";
				Statement stm = con.createStatement();
				stm.executeUpdate(sql00); 
				}
//				while(rs.next()){
//					//					rs.last();
//					String number1 = rs.getString("account");
					
//					if (number1.equals(number)){
//						String sql1 = "UPDATE  `final`.`"+number+"`  SET  `STYLE`= '"+
//								rs.getString("STYLE")+"|"+style + "' WHERE  account = '" + number + "'";
//						java.sql.PreparedStatement pstmt = con.prepareStatement(sql1);
//						pstmt.executeUpdate();
//						//˵�����ڴ��˺���
//					}
				}
	
	public static String getStyle(String account) throws SQLException{
		//����jdbc
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("error when loading jdbc");
					e.printStackTrace();
				}
				//������ݿ�
				String url = "jdbc:mysql://localhost:3306/final";
				String username = "root";
				String password = "hlm412725";
				   
				try {
					con = DriverManager.getConnection(url,username,password);
				} catch (SQLException se) {
					// TODO Auto-generated catch block
					System.out.println("error when connecting database");
					se.printStackTrace();
				}
				//ʹ�ô��������Ĳ�ѯ

				int i = 0;
				String sql3="SELECT `assort` FROM `assort` WHERE usernumber = '"+account+"'";
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery(sql3); 
				String sss = "";
				while(rs.next()){
					//��ʱ�Ѿ�ȷ������ݿ���������˺�
//					String number2 = rs.getString("account");
//					if (number2.equals(number)){
						String style = rs.getString("assort");
						sss = sss+style+",";
//						return style;
					}
				return sss;
	}
}
