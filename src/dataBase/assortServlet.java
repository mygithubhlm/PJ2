package dataBase;
import java.io.IOException;
import java.io.PrintWriter;
 
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/assortServlet")
public class assortServlet extends HttpServlet {
 
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // ��ֹ���� 
    	response.setCharacterEncoding("utf-8");
    	request.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        response.setHeader("Cache-Control", "no-store"); // HTTP1.1
        response.setHeader("Pragma", "no-cache"); // HTTP1.0
        response.setDateHeader("Expires", 0); // prevents catching at proxy
                                                // server
 
        PrintWriter out = response.getWriter();
         
        //js�������ĺ��ֽ���ת�룬���⺺�ֵ�ʱ����������
        String account = request.getParameter("account");
        String cixu = request.getParameter("cixu");
        int order = Integer.parseInt(cixu);
        try {
			out.print(assort.get(account,order));
	         System.out.print(out);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//out.print("fuck");
		}
        	
    }
}