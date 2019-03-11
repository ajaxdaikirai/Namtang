package com.com.Project.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.com.Project.VO.SnsImgSave;

@Repository
public class SnsImgSaveDAO {
	@Autowired
	SqlSession sqlSession;
	
	
	public int uploadImg(SnsImgSave snsImgSave) {
		int result = 0;
		SnsImgSaveMapper mapper = sqlSession.getMapper(SnsImgSaveMapper.class);
		try {
			result = mapper.uploadImg(snsImgSave);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
