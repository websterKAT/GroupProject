package com.projectsupport.controls;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.projectsupport.models.Supervisor;
import com.projectsupport.models.User;
import com.projectsupport.services.MyUtils;
import com.projectsupport.services.SupervisorServices;

/**
 * Servlet implementation class DoViewSupervisor
 */
@WebServlet("/DoViewSupervisor")
public class DoViewSupervisor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoViewSupervisor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Connection conn = MyUtils.getStoredConnection(request);
		User currentUser = MyUtils.getLoginedUser(session);
		String studentId = currentUser.getUserName();
		String errorString = null;
		Supervisor supervisor = null;
		try {
			supervisor = SupervisorServices.findSupervisor(conn, studentId);
		} catch (SQLException e){
			e.printStackTrace();
			errorString = e.getMessage();
		}
		String json = new Gson().toJson(supervisor);
		request.setAttribute("errorString", errorString);
		request.setAttribute("supervisorDetails", supervisor);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
