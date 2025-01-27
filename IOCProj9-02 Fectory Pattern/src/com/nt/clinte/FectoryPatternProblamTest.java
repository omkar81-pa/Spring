package com.nt.clinte;

import com.nt.comps.AdharDetails;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class FectoryPatternProblamTest {

	public static void main(String[] args) {
		AdharDetails details = new AdharDetails(87348764928L, 22, 3874834834L);
		
		Person stu = new Student("Omkar", "Rewa", details, 1001, "Java");
		System.out.println(stu);
		
		System.out.println("+++++++++++++++++++++++++");
		AdharDetails details1 = new AdharDetails(8734344928L, 24, 3874322834L);

		Person emp = new Employee("Shubham", "Rewa", details1, 1002, "Maneger");
		System.out.println(emp);
	}

}
