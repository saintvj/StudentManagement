package com.lti.collection;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.lti.entity.Student;

public class TestMaps {
	public static void main(String[] args) {
		
		//key should be unique , value should be duplicate 
		
		Map<String,String> mailId= new HashMap<>();
		
		mailId.put("jay1@gmail.com", "jay1");
		mailId.put("jay2@gmail.com", "jay12");
		mailId.put("jay3@gmail.com", "jay123");
		
		System.out.println(mailId);
		
		Student s1= new Student(101,"Jay",LocalDate.of(2001, 1, 10));
		Student s2= new Student(102,"ViJay",LocalDate.of(2001, 2, 11));
		Student s3= new Student(103,"AaJay",LocalDate.of(2001, 3, 12));
		Map<Integer,Student> stuMap = new HashMap<>();
		stuMap.put(1111,s1);
		stuMap.put(1112,s2);
		stuMap.put(1113,s3);
		
		//System.out.println(stuMap);
		
		for(Map.Entry<Integer,Student>entry: stuMap.entrySet())
		{
			System.out.println(entry.getKey()+ " = " + entry.getValue());
		}
		
		
		
		
		
		
		
		
	}
}
