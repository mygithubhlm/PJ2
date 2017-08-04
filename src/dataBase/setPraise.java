package dataBase;

import java.io.IOException;
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
 * Servlet implementation class setPraise
 */
@WebServlet("/setPraise")
public class setPraise extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public setPraise() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		Connection con;
		con = null ;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException se) {
			System.out.println ("Error when connecting database");
			//��ӡ���쳣��ջ�켣�����ǿ��Ը�����ӡ���Ĺ켣�ҵ������ľ��������쳣��
			se.printStackTrace();
	}
		//���м��
		    String title = request.getParameter("title");
			String sql = "SELECT * FROM `textcontent`";
			Statement stm;
			ResultSet rs;
			String  num = "";
				try {
					stm = con.createStatement();
					 rs = stm.executeQuery(sql);
					 while(rs.next()) {
						num = rs.getString("praise");
							}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int num0 = Integer.parseInt(num);
			String sql1 = "UPDATE `final`.`textcontent` SET `praise`='"+(num0++)+"' WHERE `title`='"+title+"'";
			Statement stm1;
			ResultSet rs1;
			
				try {
					stm1 = con.createStatement();
					stm1.executeUpdate(sql);
					 
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				boolean have=false;
			
//				String dbAccount = rs.getString("account");
//				if (dbAccount.equals(account)) {
//					have=true;
//				}
			
			}	
	
		//�����û��������Ƿ���ȷ


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
