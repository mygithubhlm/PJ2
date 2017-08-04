package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class assort {
	static Connection con = null;
	public static void create(String number,String assort) throws SQLException {
		//����jdbc
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("error when loading jdbc");
					e.printStackTrace();
				}
				//������ݿ�
				String url = "jdbc:mysql://localhost:3306/final?characterEncoding=utf-8";
				String username = "root";
				String password = "hlm412725";
				java.sql.Connection con = null;
				try {
					con = DriverManager.getConnection(url,username,password);
				} catch (SQLException se) {
					// TODO Auto-generated catch block
					System.out.println("error when connecting database");
					se.printStackTrace();
				}
				//�������û�
					String sql1 = "INSERT INTO `final`.`assort`(`usernumber`,`assort`) VALUES ('" + number +
							"','" + assort + "')";
					java.sql.Statement stm = con.createStatement();
					stm.executeUpdate(sql1);
//					String sql2 = "UPDATE `login` set NUMBER='" + number + "' where PASSWORD='" + password1 + "'" ;
//					stm.executeUpdate(sql2);
	}
	public static String get(String number,int order) throws SQLException{
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
//		java.sql.Connection con = null;
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			System.out.println("error when connecting database");
			se.printStackTrace();
		}
		//ʹ�ô��������Ĳ�ѯ
		
			int i = 0;
			int j = 0;
			String ass=null;
			String sql2="SELECT * FROM `assort`";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql2); 
			while(rs.next()){
				String numb = rs.getString("usernumber");
				String assort = rs.getString("assort");
				if(number.equals(numb)){
					i++;
					if(order==i){
						ass=assort;
						j=1;
					}
				}
				
			}
			if(j==0){
				return "";
			}else{
				return ass;
			}
	}
	public static String getNum(String account) throws SQLException{
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
			String sql2="SELECT * FROM `assort`";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql2); 
			while(rs.next()){
			String numb = rs.getString("usernumber");
			if(account.equals(numb)){
				i++;
			}
	}
			String j=String.valueOf(i);
			return j;
}
}
