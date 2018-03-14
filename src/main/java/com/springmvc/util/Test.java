package com.springmvc.util;

import java.util.List;

import com.springmvc.services.model.School;
import com.springmvc.services.service.SchoolService;

public class Test {
	public SchoolService schoolservice;
	
	public SchoolService getSchoolservice() {
		return schoolservice;
	}

	public void setSchoolservice(SchoolService schoolservice) {
		this.schoolservice = schoolservice;
	}

	public static void main(String[] args) {
		Test tes=new Test();	
		tes.show();
	}
	public void show(){
			
	  List<School>	list  = schoolservice.selectschool();
	 for (School school : list) {
		System.out.println(school.toString());
	}
		
	}

}
