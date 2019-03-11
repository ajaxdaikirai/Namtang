package com.com.Project.DAO;

import java.util.ArrayList;

import com.com.Project.VO.HashTag;

public interface HashTagMapper {
	public int insertHashTag(HashTag hashTag);
	public ArrayList<HashTag> selectHashTag(int snsSeq);

}
