

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginCheck")
public class loginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public loginCheck() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// session 생성
		HttpSession session = request.getSession();
		
		// 아이디와 패스워드 불러오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//session에 넣기
		session.setAttribute("id", id);
		session.setAttribute("pw", pw);
		
		// 쿠키 객체 생성
		Cookie cookie = new Cookie("userid", id);
		
		// 쿠키 생성
		response.addCookie(cookie);
		
		// 쿠키가 잘 되고있나 콘솔에 띄워보기 위해 실험
		Cookie[] cook = request.getCookies();
		for(Cookie cookies:cook) {
			System.out.print("쿠키명:" + cookies.getName());
			System.out.print("쿠키값:" + cookies.getValue());
		}
		// login.jsp로 이동
		response.sendRedirect("login.jsp");
	}

}
