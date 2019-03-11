package com.com.Project.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.com.Project.VO.Users;

@Repository
public class UsersDAO {
	@Autowired
	SqlSession sqlSession;
	
	public Users login(Users users) {
		Users result = null;
		UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
		try {
			result = mapper.login(users);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
