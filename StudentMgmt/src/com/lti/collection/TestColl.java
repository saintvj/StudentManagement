package com.lti.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestColl {

	public static void main(String[] args) {
		
		List <Student> stuList = new ArrayList<>();
		
		Student s1= new Student(101,"Jay",LocalDate.of(2001, 1, 10));
		Student s2= new Student(102,"ViJay",LocalDate.of(2001, 2, 11));
		Student s3= new Student(103,"AaJay",LocalDate.of(2001, 3, 12));
		
		stuList.add(s1);
		stuList.add(s2);
		stuList.add(s3);
		
			System.out.println(stuList);
		
		
		
		
		
		
		
		
		List<Integer> myList= new ArrayList<>();
		myList.add(1000);
		//myList.add(1000);
		//myList.add("JAy");
		//myList.add("JAy");
	//	myList.add(100.50);
		System.out.println(myList);
		
		
		/*Set mySet = new HashSet();
		mySet.add(100);
		mySet.add(100);
		mySet.add("jay");
		mySet.add("jay");
		mySet.add("100.50");	
		System.out.println(mySet);
		*/
		
		Set<Integer> mySet1 = new TreeSet<>();
		mySet1.add(100);
		mySet1.add(500);
		mySet1.add(50);
		System.out.println(mySet1);
		
	}
}
