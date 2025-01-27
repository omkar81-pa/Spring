package com.nt.factory;

import com.nt.comps.AdharDetails;
import com.nt.comps.Customer;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class PersonFectory {
	public static Person getInstance(String personType) {
		Person prs = null;
		
		if(personType.equalsIgnoreCase("emp")) {
			AdharDetails details1 = new AdharDetails(298473242L, 22, 8923479233L);
			prs = new Employee("Omkar", "Rewa", details1, 1001, "Software Developer");
		}else if (personType.equalsIgnoreCase("stud")) {
			AdharDetails details2 = new AdharDetails(298473353452L, 24, 8923434233L);
			prs = new Student("Subham", "Rewa", details2, 1002, "Java");
		}else if (personType.equalsIgnoreCase("cust")) {
			AdharDetails details3 = new AdharDetails(498473353452L, 24, 53423434233L);
			prs = new Customer("Shivendr", "Rewa", details3, 1003, 32894.98);
		}else {
			throw new IllegalArgumentException("Invalid PersonType");
		}
		return prs;
	}
}
