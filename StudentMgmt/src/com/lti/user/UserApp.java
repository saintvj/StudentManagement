package com.lti.user;

import java.time.LocalDate;
import java.util.Scanner;

import com.lti.entity.Student;
import com.lti.service.AdminMenu;
import com.lti.service.AdminMenuImpl;

public class UserApp {
	public static void main(String[] args) {

		AdminMenu service = new AdminMenuImpl();
		
		System.out.println("Studet management");

		System.out.println("select \n 1. Add new Student \n 2 . Display All students");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("enter student data");
			
			Student s1= new Student(101,"Jay",LocalDate.of(2001, 1, 10));
			Student s2= new Student(102,"ViJay",LocalDate.of(2001, 2, 11));
			Student s3= new Student(103,"AaJay",LocalDate.of(2001, 3, 12));
			
			
			service.register(s1);
			service.register(s2);
			service.register(s3);
			
			break;
		case 2:
			System.out.println("display the student");
			break;
		default:
			System.out.println("select proper option");
			System.out.println("select proper option");
			break;

		}
	}

}
