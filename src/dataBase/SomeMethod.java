package dataBase;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SomeMethod
 */
@WebServlet("/SomeMethod")
public class SomeMethod extends HttpServlet {
	public static int count=0;
	static Connection con;
	static Statement stm;
	static ResultSet rs;
	static String url = "jdbc:mysql://localhost:3306/final";
	static String username = "root";
	static String password = "hlm412725";
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SomeMethod() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
    public String getTime(String title) throws SQLException{
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error when loading jdbc");
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException se) {
			System.out.println ("Error when connecting database");
			//��ӡ���쳣��ջ�켣�����ǿ��Ը�����ӡ���Ĺ켣�ҵ������ľ��������쳣��
			se.printStackTrace();
	}
		String sql = "SELECT title FROM final.textcontent WHERE creater ='"+title+"'";
		stm = con.createStatement();
		rs = stm.executeQuery(sql);
//		Array text;
//		ArrayList<String> list = new ArrayList<String>();
//		String[] te = {}; 
		String result = "";
		while(rs.next()){
			result = rs.getString("time");
		}
		return result;
	}
    public static void insertComment(String title,String creater,String comits,String time) throws SQLException {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error when loading jdbc");
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException se) {
			System.out.println ("Error when connecting database");
			//��ӡ���쳣��ջ�켣�����ǿ��Ը�����ӡ���Ĺ켣�ҵ������ľ��������쳣��
			se.printStackTrace();
	}
		String sql = "INSERT INTO `final`.`textcommits` ( `title`, `creater`, `commits`, `_time`) VALUES ( '"+title+"', '"+creater+"', '"+comits+"', '"+time+"')";
		stm = con.createStatement();
		stm.executeUpdate(sql);
    }
    public static String[] getComments(String title) throws SQLException {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error when loading jdbc");
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException se) {
			System.out.println ("Error when connecting database");
			//��ӡ���쳣��ջ�켣�����ǿ��Ը�����ӡ���Ĺ켣�ҵ������ľ��������쳣��
			se.printStackTrace();
	}
		String sql = "SELECT Commits FROM final.textcommits WHERE Title ='"+title+"'";
		stm = con.createStatement();
		rs = stm.executeQuery(sql);
//		Array text;
		ArrayList<String> list = new ArrayList<String>();
//		String[] te = {}; 
		while(rs.next()){
		    list.add(rs.getString("Commits"));
//		    te = (String[])text.getArray();
		}
		String user[] = (String[])list.toArray(new String[list.size()]);
		return user;
    }
    public static int getCommentsNum(String title) throws SQLException {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error when loading jdbc");
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException se) {
			System.out.println ("Error when connecting database");
			//��ӡ���쳣��ջ�켣�����ǿ��Ը�����ӡ���Ĺ켣�ҵ������ľ��������쳣��
			se.printStackTrace();
	}
		String sql = "SELECT commits FROM final.textcommits WHERE title ='"+title+"'";
		stm = con.createStatement();
		rs = stm.executeQuery(sql);
//		Array text;
//		ArrayList<String> list = new ArrayList<String>();
		int p=0; 
		while(rs.next()){
//		    list.add(rs.getString("Commits"));
			p++;
//		    te = (String[])text.getArray();
		}
//		String user[] = (String[])list.toArray(new String[list.size()]);
		return p;
    } 
 
public static int getPraisesNum(String title) throws SQLException {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Error when loading jdbc");
		e.printStackTrace();
	}
	try {
		con = DriverManager.getConnection(url, username, password);
	} catch (SQLException se) {
		System.out.println ("Error when connecting database");
		//��ӡ���쳣��ջ�켣�����ǿ��Ը�����ӡ���Ĺ켣�ҵ������ľ��������쳣��
		se.printStackTrace();
}
	String sql = "SELECT praise FROM final.textcontent WHERE title ='"+title+"'";
	stm = con.createStatement();
	rs = stm.executeQuery(sql);
//	Array text;
//	ArrayList<String> list = new ArrayList<String>();
	int p=0; 
	while(rs.next()){
//	    list.add(rs.getString("Commits"));
		p++;
//	    te = (String[])text.getArray();
	}
//	String user[] = (String[])list.toArray(new String[list.size()]);
	return p;
}


public static int getRead(){
	return count++;
}
}  


