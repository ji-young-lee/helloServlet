package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet { //httpservlet 상속받기에 서브릿기능할수있다
	private static final long serialVersionUID = 1L; //여기서부터 url 맵핑시켜준다
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request에는 httpservletrequest에서 객체가 만들어져서 주소가 들어온다. reponse도 동일하다
		//read form data
		String username = request.getParameter("username"); //username에는 admin이 저장된다
		String password = request.getParameter("password");
		
		//process : access to database, perform business logic
		
		//build HTML code
		PrintWriter out = response.getWriter(); 
		
		String htmlResponse="<html>";
		htmlResponse += "<h2> Your username is" + username + "<br/>";
		htmlResponse += "<h2> Your password is" + password + "<h2/>";
		htmlResponse += "</html>";
		//이렇게하면 동적인 html 페이지가 만들어진다 
		//왜동적인가? 사용자가 입력한 username과 password에 따라서 다른 페이지가 만들어지기에
		
		out.println(htmlResponse); //htmlresponse여기에해당되는 웹페이지가 클라인트에게 넘어간다
		 // System.out.println(); //Ctrl + space (자동완성기능)
		  
		
 	}

}
