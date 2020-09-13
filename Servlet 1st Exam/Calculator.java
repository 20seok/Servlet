package cs.dit.cont;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Calculator() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1, num2;
		int result;
		String op;
		
		response.setContentType("text/html; charset=euc-kr");
		
		PrintWriter printW = response.getWriter();
		
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		op = request.getParameter("op");
		
		result = calc(num1, num2, op);
		
		printW.println("<HTML>");
		printW.println("<HEAD><TITLE>계산기</TITLE></HEAD>");
		printW.println("<BODY>");
		printW.println("<H1>계산결과 : ");
		printW.println(result);
		printW.println("</H1>");
		printW.println("</Body></HTML>");
	}
	
	public int calc(int num1, int num2, String op) {
		int result = 0;
		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}
		return result;
		}
	}