package edu.kh.jsp.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/jstl/student/selectOne")
public class SelectOneController extends HttpServlet {
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String deptName = req.getParameter("deptName");
	
	
	
		
	
	
	req.getRequestDispatcher("/WEB-INF/views/student/selectOne.jsp");
	
}
	

}
