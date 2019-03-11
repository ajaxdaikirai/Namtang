package com.com.Project;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.com.Project.DAO.HashTagDAO;
import com.com.Project.DAO.SnsDAO;
import com.com.Project.DAO.SnsImgSaveDAO;
import com.com.Project.VO.HashTag;
import com.com.Project.VO.Sns;
import com.com.Project.VO.SnsImgSave;

@Controller
public class SnsController {
	@Autowired
	SnsDAO dao;
	@Autowired
	SnsImgSaveDAO iDao;
	@Autowired
	HashTagDAO hDao;
	private static final String UPLOADPATH = "c:/imgUpload/";
	
	@RequestMapping(value="/goSns",method=RequestMethod.GET)
	public String goSns() {
		return "Sns";
	}
	
	@RequestMapping(value = "writeSns",method=RequestMethod.POST)
    public  String requestupload2(Sns sns,MultipartHttpServletRequest mtfRequest,HashTag hashTag) {
		String result ="";

		dao.writeSns(sns);
		
    	for (MultipartFile file : mtfRequest.getFiles("upLoadFile")) {
    		SnsImgSave snsImgSave = new SnsImgSave();
			String dbName = file.getOriginalFilename();
			long now = System.currentTimeMillis();
			String pathName = now+dbName;
			
			
			snsImgSave.setPathName(pathName);
			snsImgSave.setDbName(dbName);
			
			iDao.uploadImg(snsImgSave);
			
			try {
				file.transferTo(new File(UPLOADPATH + pathName));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
    	hDao.insertHashTag(hashTag);
    	
        return "Sns";
    }
	
	
	
}
