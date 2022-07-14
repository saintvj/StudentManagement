package com.lti.collection;

import java.time.LocalDate;

public class Student {
	
		private int studId;
		private String stuName;
		private LocalDate dob;
		
		
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((dob == null) ? 0 : dob.hashCode());
			result = prime * result + ((stuName == null) ? 0 : stuName.hashCode());
			result = prime * result + studId;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (dob == null) {
				if (other.dob != null)
					return false;
			} else if (!dob.equals(other.dob))
				return false;
			if (stuName == null) {
				if (other.stuName != null)
					return false;
			} else if (!stuName.equals(other.stuName))
				return false;
			if (studId != other.studId)
				return false;
			return true;
		}

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
