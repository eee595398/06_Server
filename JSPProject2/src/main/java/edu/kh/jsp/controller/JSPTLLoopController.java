package edu.kh.jsp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.jsp.model.dto.Book;

@WebServlet("/jstl/loop")
public class JSPTLLoopController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("언어의 무게", "파스칼 메르시어", 19800));
		bookList.add(new Book("무게의 무게", "파스칼 메르시어", 20000));
		bookList.add(new Book("노도의 상실", "호건", 19800));
		bookList.add(new Book("아들 단군", "박신효", 19800));
		
		req.setAttribute("bookList", bookList);
		
		req.getRequestDispatcher("/WEB-INF/views/jstl/loop.jsp").forward(req, resp);
	}
	
		

}
