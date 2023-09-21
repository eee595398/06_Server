package edu.kh.project.member.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import edu.kh.project.member.model.dto.Member;


public class MemberDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties prop;
	
public MemberDAO() {
	
	try {
		
		prop = new Properties();
		
		String filePath = MemberDAO.class.getResource("/edu/kh/project/sql/member-sql.xml").getPath();
		
		prop.loadFromXML(new FileInputStream(filePath));
		
		
	}catch(Exception e) {
			e.printStackTrace();
		
	}
	
}
	
	
	public Member login(Connection conn, String inputEmail, String inputPw) throws Exception{
		// TODO Auto-generated method stub
		
		Member loginMember = null;
		
		try {
			
			String sql=prop.getProperty("login");
			
			pstmt = conn.prepareStatement(sql);
		
			pstmt.setString(1, inputEmail);
			pstmt.setString(2, inputPw);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				loginMember = new Member();
				
				loginMember.setMemberNo(rs.getInt(1));
				loginMember.setMemberEmail(rs.getInt(2));
				loginMember.setMembeerNickname(rs.getInt(3));
				loginMember.setMemberTel(rs.getInt(4));
				loginMember.setMemberAddress(rs.getInt(5));
				loginMember.setProfileImage(rs.getInt(6));
				loginMember.setAuthority(rs.getInt(7));
				loginMember.setEnrollDate(rs.getInt(8));
			}
			
		}finally {
			
			close(rs);
			close(pstmt);
			
			
			
		}
		
		
		
		
		
		
		return loginMember;
	}

}
