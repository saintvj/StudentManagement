package com.lti.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//import com.lti.collection.Student;

public class TestSets {
		public static void main(String[] args) {
			
			//List<Student> myList = new ArrayList<>();
			
			//Set<Student> mySet= new HashSet<>();
			
			Set<Student> mySet = new TreeSet<>();
			
			Student s1= new Student(102,"ViJay",LocalDate.of(2001, 1, 10));
			Student s2= new Student(101,"Jay",LocalDate.of(2001, 2, 11));
			Student s3= new Student(103,"suJay",LocalDate.of(2001, 1, 10));
			
			mySet.add(s1);
			mySet.add(s2);
			mySet.add(s3);
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			System.out.println(s3.hashCode());
			
			
			System.out.println(mySet);
			
			
			
			
		/*	List<Integer> myList= new ArrayList<>();
	        myList.add(100);
	        myList.add(50);
	        myList.add(200);
	        myList.add(150);

	       System.out.println(myList);      
	        Collections.sort(myList);      
	       System.out.println(myList);
			
			
			*/
			
			
			
		}
}
