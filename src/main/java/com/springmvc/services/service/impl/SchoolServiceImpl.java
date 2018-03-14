package com.springmvc.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.services.dao.SchoolDao;
import com.springmvc.services.model.School;
import com.springmvc.services.service.SchoolService;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolService {
	@Autowired
	private SchoolDao schoolDao;
	
	
	@Override
	public List<School> selectschool() {
		List<School> list =  schoolDao.selectschool();
		return list;
	}

}
