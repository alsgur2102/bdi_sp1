package com.bdi.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.dao.BoardInfoDAO;
import com.bdi.sp.service.BoardInfoService;
import com.bdi.sp.vo.BoardInfo;

@Service
public class BoardInfoServiceImpl implements BoardInfoService {

	@Autowired
	private BoardInfoDAO bidao;
	
	@Override
	public List<BoardInfo> getBoardInfoList(BoardInfo bi) {
		return bidao.getBoardInfoList(bi); 
	}

	@Override
	public BoardInfo getBoardInfo(BoardInfo bi) {
		return null;
	}

	@Override
	public int insertBoardInfo(BoardInfo bi) {
		return 0;
	}

	@Override
	public int updateBoardInfo(BoardInfo bi) {
		return 0;
	}

	@Override
	public int deleteBoardInfo(BoardInfo bi) {
		return 0;
	}

}
