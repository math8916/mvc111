package bank;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BankController
 */
@WebServlet({"/bank/main.do",
	"/bank/regist.do",
	"/bank/deposit.do",
	"/bank/withdraw.do",
	"/bank/update.do",
	"/bank/delete.do",
	"/bank/list.do",
	"/bank/search.do",
	"/bank/count.do"})
public class BankController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String servletPath = request.getServletPath();
		String pkg = servletPath.split("/")[1];
		String path = servletPath.split("/")[2];
		String view = path.substring(0, path.indexOf("."));
		System.out.println(view);
	
		RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/"+pkg+"/"+view+".jsp");
		System.out.println(pkg+"  "+view);
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}