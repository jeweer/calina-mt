package com.springmvc.web.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.services.model.School;
import com.springmvc.services.service.SchoolService;
import com.springmvc.util.JSONUtilAction;


@Controller
@RequestMapping("/school")
public class SchoolController extends JSONUtilAction{
	public SchoolService schoolservice;
    
	public SchoolService getSchoolservice() {
		return schoolservice;
	}
	@Autowired
	public void setSchoolservice(SchoolService schoolservice) {
		this.schoolservice = schoolservice;
	}


	@RequestMapping(value = "/school", produces = "application/json;charset=UTF-8")
	@ResponseBody
 public void queryDate(HttpServletRequest request, HttpServletResponse response) {
		
        List<School> list = schoolservice.selectschool();
        if(list != null && list.size()>0){
	        ObjectMapper mapper = new ObjectMapper();
	        String result="";
			try {
				result = mapper.writeValueAsString(list);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			
			writeJSONStringToResponse(response,result); 
        }
       
    }
	@RequestMapping(value = "/index", produces = "application/json;charset=UTF-8")
	@ResponseBody
 public ModelAndView queryschool(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView();
		model.setViewName("schoollist");
	
		
        List<School> list = schoolservice.selectschool();
    	model.addObject("schoollist", list);
    
    	return model;
    }
	@RequestMapping(value = "/index1", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public ModelAndView queryschool2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ModelAndView model = new ModelAndView();
		model.setViewName("schoollist1");
	
		
        List<School> list = schoolservice.selectschool();
    	model.addObject("schoollist1", list);
    	return model;
    }
	
	
}
