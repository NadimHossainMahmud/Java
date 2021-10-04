
package classes;

import java.lang.*;

public class Employee
{
	private String name ;
	private String empId ;
	private double salary ;
	
	void setName(String name) {this.name=name;} 
	void setEmpId(String empId) {this.empId=empId;} 
	void setSalary(double salary) {this.salary=salary;} 
	
	
	String getName( ) {return name;}
	String getEmpId( ) {return empId;}
	double getSalary( ) {return salary;}
	
	

}