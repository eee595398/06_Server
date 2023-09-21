package edu.kh.project.member.model.service;

import static edu.kh.project.common.JDBCTemplate.*;

import java.sql.Connection;


import edu.kh.project.member.dao.MemberDAO;
import edu.kh.project.member.model.dto.Member;

public class MemberService {

		private MemberDAO dao = new MemberDAO();
	
	public Member login(String inputEmail, String inputPw) throws Exception {
		// TODO Auto-generated method stub
		
		Connection conn = getConnection();
		
		Member loginMember = dao.login(conn,inputEmail,inputPw);
		
		close(conn);
		
		
		return loginMember;
	}

}
