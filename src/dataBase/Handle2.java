package dataBase;

import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Handle2
 */
@WebServlet("/Handle2")
public class Handle2 extends HttpServlet {
	static Connection con;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Handle2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		//����MySQL������
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
//		String account = request.getParameter("account");
//				try {
//					Class.forName("com.mysql.jdbc.Driver");
//				} catch (ClassNotFoundException e) {
//					System.out.println("Error when loading jdbc");
//					e.printStackTrace();
//				}
//				String url = "jdbc:mysql://localhost:3306/final";
//				String username = "root";
//				String password = "hlm412725";
//				
//				//������ݿ�
//				con = null ;
//				try {
//					con = DriverManager.getConnection(url, username, password);
//				} catch (SQLException se) {
//					System.out.println ("Error when connecting database");
//					//��ӡ���쳣��ջ�켣�����ǿ��Ը�����ӡ���Ĺ켣�ҵ������ľ��������쳣��
//					se.printStackTrace();
//			}
//				//���м��
//					String sql = "SELECT * FROM `finaldb`";
//					Statement stm;
//						try {
//							stm = con.createStatement();
//							ResultSet rs = stm.executeQuery(sql);
//							String have= "f";
//							while(rs.next()) {
////								String isbn = rs.getString("ISBN");
//								String dbAccount = rs.getString("account");
//								if (dbAccount.equals(account)) {
//									have="t";
//								}
//							  }
							Writer out = response.getWriter();
							String text1="{\"info\":{\"have\":\"yes\"}";
						    out.write(text1);
						    System.out.println(text1);
//						} catch (SQLException e) {
//							// TODO Auto-generated catch block
//							System.out.println("jfajdfs");
//							e.printStackTrace();
//						}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
