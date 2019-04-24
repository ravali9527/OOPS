package objectOrientedProgramming;

import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

public class Mymain {

	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		System.out.println("pleaase enter a phone number in the specified order : id, areacode,number,countycode");
				int id1 = sc.nextInt();
				String areacode = sc.nextLine();
				String number = sc.nextLine();
				String countrycode = sc.nextLine();
				
		Phone phone = new Phone(id1,areacode,number,countrycode);
		System.out.println("please enter your address");
		int id2 =sc.nextInt();		
		String zip = sc.nextLine();
		String country = sc.nextLine();
		String state = sc.nextLine();
		String city = sc.nextLine();
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		
		
	Address addr = new Address ( id2,  zip,  country, state, city, line1, line2);
				
	/*System.out.println("please enter employe's first and lastname");
	int firstid =sc.nextInt();
	String firstname = sc.nextLine();
	String lastname = sc.nextLine();
	
	Employee emp = new Employee(firstid,firstname,lastname);
	emp.setPhoneNumber(phone);
	emp.setaddress(addr);
				
	System.out.println("please enter second employee details");
	int secondid =sc.nextInt();
	String firstname2 = sc.nextLine();
	String lastname2 = sc.nextLine();
	Employee emp1 = new Employee(secondid,firstname2,lastname2);

ArrayList <Employee>emplist = new ArrayList<Employee>();
		
	emplist.add(emp);
	emplist.add(emp1);
	
	
	Company Google = new Company(10324,"Google",emplist);
	emp.settype(EmployeeType.CONTRACTOR);
	emp1.settype(EmployeeType.FULLTIME);
	emp.setCompany(Google);

			HRService h1 = new HRService();
			h1.addEmployee(emp);
			h1.addEmployee(emp1);
			h1.search(10);*/
Employee emp = new Employee(10,"ska","ksjs");
Employee emp1 = new Employee(11,"ska","ksjs");
Employee emp2 = new Employee(12,"ska","ksjs");
			
HRService h1 = new HRService();
h1.addEmployee(emp);
h1.addEmployee(emp1);
h1.addEmployee(emp2);
h1.removeEmployee(10);

			
			}

		

	
	
	
	
	
}
