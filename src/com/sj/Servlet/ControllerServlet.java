/**
 * 
 */
package com.sj.Servlet;

/**
 * @author skamsani2
 *
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import com.sj.DAO.ProjectDAO;
import com.sj.model.Project;

import javax.servlet.http.HttpServletRequest;
/**
 * @author skamsani2
 *
 */
@WebServlet("/welcome")

	public class ControllerServlet extends HttpServlet{
		public ControllerServlet() {
			super();
		}
		
		
		protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		}
		protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
			int id=Integer.parseInt(request.getParameter("id"));
			String title=request.getParameter("title");
			String description=request.getParameter("description");
			String domain=request.getParameter("domain");
			Project p=new Project(id,title,description,domain);
			ProjectDAO pdao=new ProjectDAO();
			boolean b = false;
			try {
				b = pdao.insertProject(p);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(b==true)
			  ((ServletRequest) request).getRequestDispatcher("success.jsp").include( (ServletRequest) request,response);
		}
	}
	
	
	

