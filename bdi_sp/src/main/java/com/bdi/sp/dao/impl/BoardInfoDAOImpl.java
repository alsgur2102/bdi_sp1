package com.bdi.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.dao.BoardInfoDAO;
import com.bdi.sp.vo.BoardInfo;

@Repository
public class BoardInfoDAOImpl implements BoardInfoDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<BoardInfo> getBoardInfoList(BoardInfo bi) {
		return ss.selectList("SQL.BOARDINFO.selectBoardInfo",bi); 
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
