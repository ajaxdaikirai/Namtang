package com.com.Project.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.com.Project.VO.Sns;

@Repository
public class SnsDAO {
	@Autowired
	SqlSession sqlSession;
	
	public int writeSns(Sns sns) {
		int result =0;
		SnsMapper mapper = sqlSession.getMapper(SnsMapper.class);
		try {
			result = mapper.writeSns(sns);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
