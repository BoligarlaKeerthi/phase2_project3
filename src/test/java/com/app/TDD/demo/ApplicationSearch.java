package com.app.TDD.demo;

import java.util.HashMap;
import java.util.Map;

public class ApplicationSearch {
	
private Map<String, Integer> getapplicationdata() {
		
		Map<String, Integer> applicationMap = new HashMap<>();
		applicationMap.put("Selenium", 10);
		applicationMap.put("Cucumber", 25);
		applicationMap.put("jmeter", 20);
		applicationMap.put("testing", 50);
		

		return applicationMap;
	}
	
	public int getapplication(String courses) {
		
		Map<String, Integer> applicationMap = null ;
		int count =0;
		
		if(courses.isEmpty())
		{
			throw new NullPointerException("course name cannot be empty");
		}
		applicationMap = getapplicationdata();
		
		if(!applicationMap.containsKey(courses))
		{
			throw new NullPointerException("course name doesnot exist");
		}
		else {
		count = applicationMap.get(courses);
		}
		return count;
		
	}

}


