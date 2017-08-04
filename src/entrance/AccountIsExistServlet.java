package entrance;
import java.io.IOException;
import java.io.PrintWriter;
 
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/AccountIsExistServlet")
public class AccountIsExistServlet extends HttpServlet {
 
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // ��ֹ����
        response.setContentType("application/json");
        response.setHeader("Cache-Control", "no-store"); // HTTP1.1
        response.setHeader("Pragma", "no-cache"); // HTTP1.0
        response.setDateHeader("Expires", 0); // prevents catching at proxy
                                                // server
 
        PrintWriter out = response.getWriter();
         
        //js�������ĺ��ֽ���ת�룬���⺺�ֵ�ʱ����������
        String account = request.getParameter("account");
        UserInfoBO userInfoBO = new UserInfoBO();
        boolean b = false;
		try {
			b = userInfoBO.accountIsExist(account);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (b) {
            out.print(true);
        }
    }
 
}