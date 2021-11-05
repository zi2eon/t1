package ch17.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ch17.dao.MemberDao;
import ch17.model.Member;

public class Login implements CommandProcess {
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		MemberDao md = MemberDao.getInstance();
		Member member = md.select(id);
		int result = 0; // 암호가 다르다
		if(member == null || member.getDel().equals("y")) result = -1; // 데이터 없음
		else
			if(member.getPassword().equals(password)) {
				HttpSession session = request.getSession();
				session.setAttribute("id", id);
				result = 1; // 암호 일치
			}
		request.setAttribute("result", result);
		return "login";
	}
}
