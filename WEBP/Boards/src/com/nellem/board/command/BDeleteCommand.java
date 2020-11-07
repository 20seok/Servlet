package com.nellem.board.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nellem.board.dao.BoardDAO;


public class BDeleteCommand implements BCommand{
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.setCharacterEncoding("utf-8"); 
		  
		  int no = Integer.parseInt(request.getParameter("no"));
		  
		  BoardDAO dao = new BoardDAO();
		  
		  dao.delete(no);
	}
}
