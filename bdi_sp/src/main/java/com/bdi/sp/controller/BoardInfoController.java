package com.bdi.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bdi.sp.service.BoardInfoService;
import com.bdi.sp.vo.BoardInfo;

@Controller
public class BoardInfoController {

	@Autowired
	private BoardInfoService bis;
	
	/*@RequestMapping(value="/boards",method=RequestMethod.GET)
	public String getBoardInfoList(@RequestParam(value="bititle", required=false) String bititle, Model m) {	// (value="bititle", required=false) String bititle == Map<String,String> pMap
		BoardInfo bi = new BoardInfo();
		bi.setBititle(bititle); 
		m.addAttribute("list",bis.getBoardInfoList(bi));  
		return "board/boardList";*/
		
		@RequestMapping(value="/boards",method=RequestMethod.GET)
		public String getBoardInfoList(BoardInfo bi, Model m) {
			m.addAttribute("list",bis.getBoardInfoList(bi));  
			return "board/boardList";
	}
 }
