package edu.kh.jsp.student.model.service;

import static edu.kh.jsp.common.JDBCTemplate.close;

import java.sql.Connection;
import java.util.List;
import static edu.kh.jsp.common.JDBCTemplate.*;

import edu.kh.jsp.student.model.dao.StudentDAO;
import edu.kh.jsp.student.model.dto.Student;

public class StudentService1 {


	private StudentDAO dao = new StudentDAO();
	
		
		public List<Student> selectArch() throws Exception{
			
			Connection conn = getConnection();
			List<Student> stdList = dao.selectAll(conn);
		
			close(conn);
			
			
			return stdList;
			
		}
		 
		


}
