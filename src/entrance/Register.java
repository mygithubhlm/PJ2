package entrance;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register {
		protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException , IOException{
		String name = request.getParameter("qm");
		String number = request.getParameter("yhm");
		String password = request.getParameter("mm");
		String hobby = request.getParameter("qxmm");
		String sex = request.getParameter("sex");
		String email = request.getParameter("lxfs");
	}
}
