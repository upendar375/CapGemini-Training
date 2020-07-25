package com.capg;

public class Trainee implements Comparable<Trainee> {

	String tName;
	String batchName;
	int age;
	int height;
	@Override
	public int compareTo(Trainee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Trainee(String tName, String batchName, int age, int height) {
		super();
		this.tName = tName;
		this.batchName = batchName;
		this.age = age;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Trainee [tName=" + tName + ", batchName=" + batchName + ", age=" + age + ", height=" + height + "]";
	}
	public int compareTo1(Trainee t) {
		return this.batchName.compareTo(t.batchName);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((batchName == null) ? 0 : batchName.hashCode());
		result = prime * result + height;
		result = prime * result + ((tName == null) ? 0 : tName.hashCode());
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
		Trainee other = (Trainee) obj;
		if (age != other.age)
			return false;
		if (batchName == null) {
			if (other.batchName != null)
				return false;
		} else if (!batchName.equals(other.batchName))
			return false;
		if (height != other.height)
			return false;
		if (tName == null) {
			if (other.tName != null)
				return false;
		} else if (!tName.equals(other.tName))
			return false;
		return true;
	}
	
	
//	public Trainee(String tName, String batchName, int age) {
//		super();
//		this.tName = tName;
//		this.batchName = batchName;
//		this.age = age;
//	}
//	
//	public Trainee() {
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public String toString() {
//		return "Trainee [tName=" + tName + ", batchName=" + batchName + ", age=" + age + "]";
//	}
//
//	@Override
//	public int compareTo(Trainee t) {
//		return this.batchName.compareTo(t.batchName);
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((batchName == null) ? 0 : batchName.hashCode());
//		result = prime * result + ((tName == null) ? 0 : tName.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Trainee other = (Trainee) obj;
//		if (age != other.age)
//			return false;
//		if (batchName == null) {
//			if (other.batchName != null)
//				return false;
//		} else if (!batchName.equals(other.batchName))
//			return false;
//		if (tName == null) {
//			if (other.tName != null)
//				return false;
//		} else if (!tName.equals(other.tName))
//			return false;
//		return true;
//	}
//	
//	
//	
//	

}
