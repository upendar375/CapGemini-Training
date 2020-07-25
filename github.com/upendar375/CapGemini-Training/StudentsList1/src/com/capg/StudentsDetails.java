package com.capg;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;
//import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//import java.util.TreeSet;
public class StudentsDetails{
public static void main(String[] args) {
	List<Trainee> trainees=Arrays.asList(
			new Trainee("Mahesh","Batch 3",22,5),
			new Trainee("Rahul","Batch 1",23,6),
			new Trainee("Harsh","Batch 2",8, 0),
			new Trainee("Rahul","Batch 1",23,9)
			);
	
	Set<Trainee> traineeSet=new HashSet<>(trainees);
	
	System.out.println("Trainee Set - ");
	traineeSet.forEach(t->System.out.println(t));
	
	Collections.sort(trainees,(t1,t2)->t1.tName.compareTo(t2.tName));
	System.out.println();
	System.out.println("Trainee List - ");
	trainees.forEach(t->System.out.println(t));
			
	
	
	
}

}

