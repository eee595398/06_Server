package edu.kh.jsp.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.jsp.student.model.dto.Student;
import edu.kh.jsp.student.model.service.StudentService1;

@WebServlet("/jstl/student/selectArch")
public class SelectArchController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		StudentService1  service1 = new StudentService1 ();
		
		try {
			
			List<Student> stdList = service1.selectArch();
			
			req.setAttribute("stdList", stdList);
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		req.getRequestDispatcher("/WEB-INF/views/jstl/student/selectArch.jsp").forward(req, resp);
		
	}

}
