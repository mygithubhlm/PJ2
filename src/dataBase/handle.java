package dataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class handle {
	static Connection con;
	
	public static void main(String[] args) throws SQLException {
		//����MySQL
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error when loading jdbc");
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/final";
		String username = "root";
		String password = "hlm412725";
		
		//������ݿ�
		con = null ;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException se) {
			System.out.println ("Error when connecting database");
			//��ӡ���쳣��ջ�켣�����ǿ��Ը�����ӡ���Ĺ켣�ҵ������ľ��������쳣��
			se.printStackTrace();
	}		
//			
//		String sql = "INSERT INTO `finaldb` (name,account,passqord,sex) values('name','account','_password','boy')";
//		Statement stm = con.createStatement();
//		stm.executeUpdate(sql);
//		HandleText.InsertContent("title", "creater", "praise", "content", "time", "kind");
//		SomeMethod a = new SomeMethod();
//		String[] re = a.getComments("番茄酱鳕鱼的做法");
//		System.out.println(Accept.getStyle("hlm"));
		System.out.println(CheckAccount("hlm"));
		
//		ResultSet rs = stm.executeUpdate(sql);
		
//		while(rs.next()) {
//			String isbn = rs.getString("account");
//			String bookName = rs.getString("password");
//			System.out.println(bookName+":"+isbn);
//		    }
	}
	//���в�ѯ�˺��Ƿ����
	public static boolean CheckAccount(String account) throws SQLException {
		
		//����MySQL������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error when loading jdbc");
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/final";
		String username = "root";
		String password = "hlm412725";
		
		//������ݿ�
		con = null ;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException se) {
			System.out.println ("Error when connecting database");
			//��ӡ���쳣��ջ�켣�����ǿ��Ը�����ӡ���Ĺ켣�ҵ������ľ��������쳣��
			se.printStackTrace();
	}
		//���м��
			String sql = "SELECT * FROM `finaldb`";
			Statement stm;
				stm = con.createStatement();
				ResultSet rs = stm.executeQuery(sql);
				boolean have=false;
			while(rs.next()) {
//				String isbn = rs.getString("ISBN");
				String dbAccount = rs.getString("account");
				if (dbAccount.equals(account)) {
					have=true;
				}
			  }
			if (have==false) 
				return false;
			else
				return true;
			}	
	
		//�����û��������Ƿ���ȷ
	public static boolean checkPassword (String account, String _password) throws SQLException {
		//����MySQL������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error when loading jdbc");
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/final";
		String username = "root";
		String password = "hlm412725";
		
		//������ݿ�
		Connection con = null ;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException se) {
			System.out.println ("Error when connecting database");
			//��ӡ���쳣��ջ�켣�����ǿ��Ը�����ӡ���Ĺ켣�ҵ������ľ��������쳣��
			se.printStackTrace();
	}
		
		//���м��
				String sql = "SELECT * FROM `finaldb`";
				boolean result = false;
				Statement stm ;
				stm = con.createStatement();
				ResultSet rs = stm.executeQuery(sql);
				while(rs.next()) {
					String dbAccount = rs.getString("account");
					String dbPassword = rs.getString("password");
					if (dbAccount.equals(account)&&dbPassword.equals(_password)){
					result = true;
					}
				}
				return result;
			}
	//�������
	public static void insert(String account,String password1,String email,String tel,String age,String qq,String pi,String name,String photourl) throws SQLException{
		//����MySQL������
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					System.out.println("Error when loading jdbc");
					e.printStackTrace();
				}
				String url = "jdbc:mysql://localhost:3306/final";
				String username = "root";
				String password = "hlm412725";
				
				//������ݿ�
				con = null ;
				try {
					con = DriverManager.getConnection(url, username, password);
				} catch (SQLException se) {
					System.out.println ("Error when connecting database");
					//��ӡ���쳣��ջ�켣�����ǿ��Ը�����ӡ���Ĺ켣�ҵ������ľ��������쳣��
					se.printStackTrace();
			}		
//				//��ʼִ�в���
				String sql1 = "INSERT INTO `final`.`finaldb`(`account`,`password`,"
						+ "`email`,`tel`,`age`,`qq`,`pi`,`name`,`photourl`) VALUES ('"+account + "','" + password1 + "','" + email + "','" + tel + "','" 
						+ age  + "','" +qq+"','" +pi+"','"+ name+"','" + photourl+ "')";
				//String sql = "INSERT INTO `finaldb` (name,account,password,email,tel,age,qq,pi) values('"+name+"','"+account+"','"+_password+"','"+email+"','"+tel+"','"+age+"','"+qq+"','"+pi+"')";
				Statement stm = con.createStatement();
				stm.executeUpdate(sql1);
				
				String sql = "create table `" + account + "` (TIME  varchar(100)  primary key not null,"
						+ "ARTICLE text(5000) not null,STYLE varchar(20) not null,"
						+ "SIGN VARCHAR(100) not null,INPUT VARCHAR(100) not null);";
				//������֤
				//String sql4 = "INSERT INTO `" + name + "`(`TIME`,`ARTICLE`,`STYLE`)"  +
				//"VALUES('s','s','s');";
				// stm.executeUpdate(sql4);
				java.sql.PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.executeUpdate();
				
	}
	public static String getName(String account) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error when loading jdbc");
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/final";
		String username = "root";
		String password = "hlm412725";
		
		//������ݿ�
		con = null ;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException se) {
			System.out.println ("Error when connecting database");
			//��ӡ���쳣��ջ�켣�����ǿ��Ը�����ӡ���Ĺ켣�ҵ������ľ��������쳣��
			se.printStackTrace();
	}
		String sql = "SELECT name FROM finaldb WHERE account = '"+ account+"'";
		Statement stm;
		stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		String name="";
		while(rs.next()) {
		    name = rs.getString("name");
//			String bookName = rs.getString("password");
			System.out.println("name :"+name);
		    }
		
		return name;
	}
	public static String getNameByTitle(String title) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error when loading jdbc");
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/final";
		String username = "root";
		String password = "hlm412725";
		
		//������ݿ�
		con = null ;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException se) {
			System.out.println ("Error when connecting database");
			//��ӡ���쳣��ջ�켣�����ǿ��Ը�����ӡ���Ĺ켣�ҵ������ľ��������쳣��
			se.printStackTrace();
	}
		String sql = "SELECT Creater FROM textcommits WHERE Title = '"+ title+"'";
		Statement stm;
		stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		String name="";
		while(rs.next()) {
		    name = rs.getString("Creater");
//			String bookName = rs.getString("password");
			System.out.println("name :"+name);
		    }
		
		return name;
	}
	public static String getURL(String account) throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error when loading jdbc");
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/final";
		String username = "root";
		String password = "hlm412725";
		
		//������ݿ�
		con = null ;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException se) {
			System.out.println ("Error when connecting database");
			//��ӡ���쳣��ջ�켣�����ǿ��Ը�����ӡ���Ĺ켣�ҵ������ľ��������쳣��
			se.printStackTrace();
	}
		String sql = "SELECT photourl FROM finaldb WHERE account = '"+account+"'";
		Statement stm;
		stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		String photourl="";
		while(rs.next()) {
		    photourl = rs.getString("photourl");
//			String bookName = rs.getString("password");
//			System.out.println("name :"+name);
		    }
		
		return photourl;
	}
	}
