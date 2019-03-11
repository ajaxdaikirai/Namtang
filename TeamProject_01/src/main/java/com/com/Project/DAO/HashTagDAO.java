package com.com.Project.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.com.Project.VO.HashTag;

@Repository
public class HashTagDAO {
	@Autowired
	SqlSession sqlSession;
	
	public int insertHashTag(HashTag hashTag) {
		int result = 0;
		HashTagMapper mapper = sqlSession.getMapper(HashTagMapper.class);
		try {
			result = mapper.insertHashTag(hashTag);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	public ArrayList<HashTag> selectHashTag(int snsSeq){
		ArrayList<HashTag> hList = null;
		HashTagMapper mapper = sqlSession.getMapper(HashTagMapper.class);
		try {
			hList = mapper.selectHashTag(snsSeq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return hList;
	}
}
