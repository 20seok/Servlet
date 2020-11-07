package com.nellem.board.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nellem.board.dao.BoardDAO;
import com.nellem.board.dto.BoardDTO;



public class BInsertCommand implements BCommand{
public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardDTO dto = new BoardDTO();	//DB에 데이터를 저장하기 위해 DTO 객체 생성
		
		dto.setWriter(request.getParameter("writer"));		//DTO에 폼에서 전달된 데이터를 저장
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		
		
		BoardDAO dao = new BoardDAO();	
		dao.insert(dto);			//DB에 DTO객체를 저장하기 위한 메소드 insert 호출
	}
}
