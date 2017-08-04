package dataBase;

import java.util.Vector; 
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
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

import sun.misc.Regexp;
import entrance.UserInfoBO;

/**
 * Servlet implementation class HandleText
 */
@WebServlet("/HandleText")
public class HandleText extends HttpServlet {
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
    public HandleText() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
//	
//		String name = request.getParameter("name");
//		        response.setContentType("application/text");
		        response.setHeader("Cache-Control", "no-store"); // HTTP1.1
		        response.setHeader("Pragma", "no-cache"); // HTTP1.0
		        response.setDateHeader("Expires", 0); // prevents catching at proxy
		                                                // server
		 
		        PrintWriter out = response.getWriter();
		         
		        //js�������ĺ��ֽ���ת�룬���⺺�ֵ�ʱ����������
		        String account = request.getParameter("name");
		        String number = request.getParameter("number");
		        int i = Integer.parseInt(number);
		        handle userInfoBO = new handle();
		        String[] b = {};
				try {
					b = getAllTitle();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				System.out.print(b[0].toString());
//		        if (b) {
//				    out.write("ssssss");
		            out.print(b[i].toString());
	//	            System.out.println(new File("").getAbsolutePath());
//		        }
		    }
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
//	public static void main(String[] args) throws SQLException {
//		// String[] a={};
//		 String[] a = getText("小明");
//		 for (int i=0;i<a.length;i++) {
//			 System.out.println(a[i]);
//		 }
//	}
	public static String[] getText(String name) throws SQLException {
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
		String sql = "SELECT content FROM final.textcontent WHERE creater ='"+name+"'";
		stm = con.createStatement();
		rs = stm.executeQuery(sql);
//		Array text;
		ArrayList<String> list = new ArrayList<String>();
//		String[] te = {}; 
		while(rs.next()){
		    list.add(rs.getString("content"));
//		    te = (String[])text.getArray();
		}
		String user[] = (String[])list.toArray(new String[list.size()]);
		return user;
	}
	public static String[] getAllText() throws SQLException {
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
		String sql = "SELECT content FROM final.textcontent";
		stm = con.createStatement();
		rs = stm.executeQuery(sql);
//		Array text;
		ArrayList<String> list = new ArrayList<String>();
//		String[] te = {}; 
		while(rs.next()){
		    list.add(rs.getString("content"));
//		    te = (String[])text.getArray();
		}
		String user[] = (String[])list.toArray(new String[list.size()]);
		return user;
	}
	public static String[] getAllTitle() throws SQLException {
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
		String sql = "SELECT title FROM final.textcontent";
		stm = con.createStatement();
		rs = stm.executeQuery(sql);
//		Array text;
		ArrayList<String> list = new ArrayList<String>();
//		String[] te = {}; 
		while(rs.next()){
		    list.add(rs.getString("title"));
//		    te = (String[])text.getArray();
		}
		String user[] = (String[])list.toArray(new String[list.size()]);
		return user;
	}
	public static String[] getTitle(String name) throws SQLException {
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
		String sql = "SELECT title FROM final.textcontent WHERE Creater = '"+name+"'";
		stm = con.createStatement();
		rs = stm.executeQuery(sql);
//		Array text;
		ArrayList<String> list = new ArrayList<String>();
//		String[] te = {}; 
		while(rs.next()){
		    list.add(rs.getString("title"));
//		    te = (String[])text.getArray();
		}
		String user[] = (String[])list.toArray(new String[list.size()]);
		return user;
	}
	public static int getBlogNum() throws SQLException{
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
		String sql = "SELECT * FROM final.textcontent";
		stm = con.createStatement();
		rs = stm.executeQuery(sql);
//		Array text;
//		ArrayList<String> list = new ArrayList<String>();
//		String[] te = {}; 
		int num = 0;
		while(rs.next()){
			num++;
//		    list.add(rs.getString("title"));
//		    te = (String[])text.getArray();
		}
//		String user[] = (String[])list.toArray(new String[list.size()]);
		return num;
	}	
	
	public static void InsertContent(String title,String creater,String praise,String content,String time,String kind) throws SQLException{
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
		String sql = "INSERT INTO `final`.`textcontent` ( `title`, `creater`, `praise`, `content`, `_time`, `kind`) VALUES ('"+title+"','"+creater+"','"+praise+"','"+content+"','"+time+"','"+kind+"')";

		stm = con.createStatement();
		stm.executeUpdate(sql);
//		Array text;
	}
	public static String getSubString(String Htmlstring) {
		 Htmlstring = Htmlstring.replace( "<br/>","\n");
		 Htmlstring = Htmlstring.replace( "<br/>","\r\n"); 
		 Htmlstring =Htmlstring.replace("&lt;","<");
		 Htmlstring = Htmlstring.replace("&gt;",">");
		 Htmlstring = Htmlstring.replace("&quot;","\"") ;
		 Htmlstring =Htmlstring.replace ("nbsp;"," ");
		 Htmlstring =Htmlstring.replace ("&amp;","");
//		 Htmlstring = Regexp.Replace(Htmlstring,@"<script[^>]*?>.*?</script>","",RegexOptions.IgnoreCase);
//		 //删除HTML
//		 Htmlstring = Regexp.Replace(Htmlstring,@"<(.[^>]*)>","",RegexOptions.IgnoreCase);
//		 Htmlstring = Regex.Replace(Htmlstring,@"([\r\n])[\s]+","",RegexOptions.IgnoreCase);
//		 Htmlstring = Regex.Replace(Htmlstring,@"-->","",RegexOptions.IgnoreCase);
//		 Htmlstring = Regex.Replace(Htmlstring,@"<!--.*","",RegexOptions.IgnoreCase);
//		 Htmlstring = Regex.Replace(Htmlstring,@"&(quot|#34);","\"",RegexOptions.IgnoreCase);
//		 Htmlstring = Regex.Replace(Htmlstring,@"&(amp|#38);","&",RegexOptions.IgnoreCase);
//		 Htmlstring = Regex.Replace(Htmlstring,@"&(lt|#60);","<",RegexOptions.IgnoreCase);
//		 Htmlstring = Regex.Replace(Htmlstring,@"&(gt|#62);",">",RegexOptions.IgnoreCase);
//		 Htmlstring = Regex.Replace(Htmlstring,@"&(nbsp|#160);"," ",RegexOptions.IgnoreCase);
//		 Htmlstring = Regex.Replace(Htmlstring,@"&(iexcl|#161);","\xa1",RegexOptions.IgnoreCase);
//		 Htmlstring = Regex.Replace(Htmlstring,@"&(cent|#162);","\xa2",RegexOptions.IgnoreCase);
//		 Htmlstring = Regex.Replace(Htmlstring,@"&(pound|#163);","\xa3",RegexOptions.IgnoreCase);
//		 Htmlstring = Regex.Replace(Htmlstring,@"&(copy|#169);","\xa9",RegexOptions.IgnoreCase);
//		 Htmlstring = Regex.Replace(Htmlstring,@"&#(\d+);","",RegexOptions.IgnoreCase);

		 Htmlstring.replace("<","");
		 Htmlstring.replace(">","");
		 Htmlstring.replace("\r\n","");
		 Htmlstring.replaceAll(" ","&nbsp;");
		 Htmlstring.replace("<pre>", "");
		 Htmlstring.replace("</pre>", "");
		 

		 //对字符串长度进行判断。然后依据长短进行截取
		if (Htmlstring.length() < 100)
		 {//如果长度小于100个字符
		return Htmlstring;
		 }
		 else
		 { 
		 Htmlstring = Htmlstring.substring(0,100) + "...</pre>";
		 return Htmlstring;
		 } 
	}
}

