package com.nt.clinte;

import com.nt.comps.AdharDetails;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;
import com.nt.factory.PersonFectory;

public class FectoryPatternProblamTest {

	public static void main(String[] args) {
		Person emp = PersonFectory.getInstance("emp");
		System.out.println(emp);
		System.out.println();
		
		Person stu = PersonFectory.getInstance("stud");
		System.out.println(stu);
	}

}
