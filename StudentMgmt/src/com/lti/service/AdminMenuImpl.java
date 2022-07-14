package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import com.lti.entity.Student;

public class AdminMenuImpl implements AdminMenu{

		private List<Student> stuList= new ArrayList<>();
	@Override
	public void register(Student s) {
		System.out.println("student :" +s);
		
	}

}
