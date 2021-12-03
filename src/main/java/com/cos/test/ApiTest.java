package com.cos.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿이란 Dynamic Web Page를 만들때 사용되는 자바 기반의 웹 애플리 케이션 
// 클라언트에서 요청, 응답 --> GET, POST
@WebServlet("/test")
public class ApiTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ApiTest() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
    	super.init();
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	super.service(req, resp);
    }
    
    @Override
    public void destroy() {
    	super.destroy();
    }
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mime = request.getContentType(); 
		System.out.println(mime);
		
		String food = request.getParameter("food");
		System.out.println(food);
		
		// DB 에 접속해서 결과을 찾아서 리턴 
		// 객체 
		
		response.setContentType("text/plain;charset=utf-8");
		PrintWriter out = response.getWriter(); 
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>"+ food +"</h1>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String food = request.getParameter("food");
		String recipe = request.getParameter("recipe");
		
		System.out.println(food);
		System.out.println(recipe);
		
		// 
		// DB에 인설트 하고 끝 
		
		int result = 1; // -1 
		
		if(result == 1) {
			// 성공 응답 
		} else {
			// 실패 응답 
		}
		// rmf 
		response.setContentType("text/plain; charset=utf-8");
		PrintWriter out = response.getWriter(); 
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>포스트방식입니다.</h1>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		
		
		
	}

}
