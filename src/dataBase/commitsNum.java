package dataBase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class commitsNum
 */
@WebServlet("/commitsNum")
public class commitsNum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public commitsNum() {
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
		        String title = request.getParameter("title");
		        title="番茄酱鳕鱼的做法";
//		        String number = request.getParameter("number");
//		        int i = Integer.parseInt(number);
		        handle userInfoBO = new handle();
		        int  b = 0;
				try {
					b = SomeMethod.getCommentsNum(title);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				System.out.print(b[0].toString());
//		        if (b) {
//				    out.write("ssssss");
		            out.print(b);
	//	            System.out.println(new File("").getAbsolutePath());
//		        }
		    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	public static int getComNum(String title) {
		
//		String name = request.getParameter("name");
//		        response.setContentType("application/text");
		      
		 
		        
		         
		        //js�������ĺ��ֽ���ת�룬���⺺�ֵ�ʱ����������
		        
//		        title="番茄酱鳕鱼的做法";
//		        String number = request.getParameter("number");
//		        int i = Integer.parseInt(number);
		        handle userInfoBO = new handle();
		        int  b = 0;
				try {
					b = SomeMethod.getCommentsNum(title);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				System.out.print(b[0].toString());
//		        if (b) {
//				    out.write("ssssss");
		          return b;
	//	            System.out.println(new File("").getAb
	}

}
