package dataBase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entrance.UserInfoBO;

/**
 * Servlet implementation class hehe
 */
@WebServlet("/hehe")
public class hehe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hehe() {
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
		      
	            response.setHeader("Cache-Control", "no-store"); // HTTP1.1
		        response.setHeader("Pragma", "no-cache"); // HTTP1.0
		        response.setDateHeader("Expires", 0); // prevents catching at proxy
		                                                // server
		 
		        PrintWriter out = response.getWriter();
		         
		        //js�������ĺ��ֽ���ת�룬���⺺�ֵ�ʱ����������
		        String account = request.getParameter("name");
		        handle userInfoBO = new handle();
		        String b = "";
				try {
					b = handle.getName(account);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//		        if (b) {
//				    out.write("ssssss");
		            out.print(b);
//		        }
		    }
	    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
