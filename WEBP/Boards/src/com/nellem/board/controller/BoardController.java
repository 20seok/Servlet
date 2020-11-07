package com.nellem.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nellem.board.command.BCommand;
import com.nellem.board.command.BDeleteCommand;
import com.nellem.board.command.BInsertCommand;
import com.nellem.board.command.BListCommand;
import com.nellem.board.command.BUpdateCommand;
import com.nellem.board.command.BViewCommand;

@WebServlet("*.do")
public class BoardController extends HttpServlet {
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String viewPage =null;
		BCommand command = null;
		
		String uri = request.getRequestURI(); 	//uri :/member-mvc/list.do
		String com= uri.substring(uri.lastIndexOf("/")+ 1, uri.lastIndexOf(".do")); //command :insert
		
		if(com !=null && com.trim().equals("boardList")) {
			command = new BListCommand();
			command.execute(request, response);
			viewPage = "bList.jsp";
		}
	
		else if(com !=null && com.trim().equals("insertForm")) {
			viewPage = "bInsertForm.jsp";
			
		}
		else if(com !=null && com.trim().equals("insert")) {
			command = new BInsertCommand();
			command.execute(request, response);
			viewPage ="boardList.do";
		}
		else if(com !=null && com.trim().equals("view")) {
			command = new BViewCommand();
			command.execute(request, response);
			viewPage = "bView.jsp";
		}
		else if(com !=null && com.trim().equals("update")){
			command = new BUpdateCommand();
			command.execute(request, response);
			viewPage = "boardList.do";
		}
		else if(com !=null && com.trim().equals("delete")){
			command = new BDeleteCommand();
			command.execute(request, response);
			viewPage = "boardList.do";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(viewPage);
		rd.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

}
