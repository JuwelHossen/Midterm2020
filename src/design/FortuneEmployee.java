package design;

import java.util.Scanner;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		


		EmployeeInfo  employeeInfo1 = 	new EmployeeInfo("A",1);
		EmployeeInfo  employeeInfo2 = 	new EmployeeInfo("B",2);
		EmployeeInfo  employeeInfo3 = 	new EmployeeInfo("C",3);

		System.out.println("NAME OF EMP 1 : "+employeeInfo1.employeeName());
		System.out.println("NAME OF EMP 2 : "+employeeInfo2.employeeName());
		System.out.println("NAME OF EMP 3 : "+employeeInfo3.employeeName());
		System.out.println("\n..........");

		System.out.println("PENSION OF EMP 1 : "+employeeInfo1.calculateEmployeePension(5));
		System.out.println("PENSION OF EMP 2 : "+employeeInfo2.calculateEmployeePension(2));
		System.out.println("PENSION OF EMP 3 : "+employeeInfo3.calculateEmployeePension(1));

		System.out.println("\n..........");
		System.out.println("Bonus OF EMP 1 : "+ EmployeeInfo.calculateEmployeeBonus(10,5000));
		System.out.println("BONUS EMP 2 : "+EmployeeInfo.calculateEmployeeBonus(5,2000));
		System.out.println("BONUS  EMP 3 : "+EmployeeInfo.calculateEmployeeBonus(1,1000));


	}

}
