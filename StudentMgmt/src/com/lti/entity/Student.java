package com.lti.entity;

import java.time.LocalDate;

public class Student {
	
		private int studId;
		private String stuName;
		private LocalDate dob;
		
		
		public Student(int studId, String stuName, LocalDate dob) {
			super();
			this.studId = studId;
			this.stuName = stuName;
			this.dob = dob;
			
		}
		
		public Student() {
			super();
		}


		public int getStudId() {
			return studId;
		}
		public void setStudId(int studId) {
			this.studId = studId;
		}
		public String getStuName() {
			return stuName;
		}
		public void setStuName(String stuName) {
			this.stuName = stuName;
		}
		public LocalDate getDob() {
			return dob;
		}
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
		@Override
		public String toString() {
			return "Student [studId=" + studId + ", stuName=" + stuName + ", dob=" + dob + "]";
		}
		
		
}
