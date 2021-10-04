import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FoodCourt f= new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		
		
		System.out.println("-----------------------------------");
		System.out.println("Welcome to GrandArea Food Corner");
		System.out.println("-----------------------------------\n");
		
		
		boolean repeat= true;
		
		while (repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Restaurant Management");
			System.out.println("\t3. Restaurant FoodItem Management");
			System.out.println("\t4. FoodItem Quantity Add-Sell");
			System.out.println("\t5. Exit");
			System.out.println("-----------------------------------\n");
			int choice = sc.nextInt();
			System.out.println("-----------------------------------");
			
			switch (choice)
			{
				case 1:
				
					System.out.println("------------------------------------");
					System.out.println("You have chosen Employee Management");
					System.out.println("------------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search An Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employe Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(f.insertEmployee(e1)){ System.out.println("Employee Inserted with ID: "+e1.getEmpId());}
							else{System.out.println("Employee Can Not be Insertd......");}
							
							break;
							
						case 2:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove Existing Employee ");
							System.out.println("---------------------------------");
							
							
							System.out.print("Enter an Employee ID to Remove: ");
							String empId2 = sc.next();
							
							Employee e2 = f.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(f.removeEmployee(e2)){ System.out.println("Employee Removed with ID: "+e2.getEmpId());}
								else{System.out.println("Employee Can Not be Removed......");}
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							
							break;
							
						case 3:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search an Employee ");
							System.out.println("---------------------------------");
							
							
							System.out.print("Enter an Employee ID to Search: ");
							String empId3 = sc.next();
							
							Employee e3 = f.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							
							break;
							
						case 4:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Show All Employees ");
							System.out.println("---------------------------------");
							
							f.showAllEmployees();
							
							break;
							
						case 5:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back ");
							System.out.println("---------------------------------");
							
							break;
							
						default :
						
							System.out.println("-----------------------------------");
							System.out.println("Invalid Choice.....");
						
							break;
					}
				
					break ;
					
				case 2:
				
					System.out.println("------------------------------------");
					System.out.println("You have chosen Restaurant Management");
					System.out.println("------------------------------------");
					
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Restaurant");
					System.out.println("\t2. Remove Existing Restaurant");
					System.out.println("\t3. Search A Restaurant");
					System.out.println("\t4. Show All Restaurant");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert A Restaurant");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Restaurant RID: ");
							int rid1 = sc.nextInt();
							System.out.print("Enter Restaurant Name: ");
							String name1 = sc.next();
							
							Restaurant r1 = new Restaurant();
							r1.setrid(rid1);
							r1.setName(name1);
							
							if(f.insertCustomer(r1)){System.out.println("Restaurant Inserted with RID: "+c1.getrid());}
							else{System.out.println("Restaurant can not be inserted");}
							
							break;
							
						case 2:
						
							break;
							
						case 3:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search a Restaurant");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Restaurant RID: ");
							int rid3 = sc.nextInt();
							
							Restaurant r3 = f.searchCustomer(rid3);
							
							if(r3 != null)
							{
								System.out.println("Restaurant Found");
								System.out.println("Restaurant Name: "+r3.getName());
								System.out.println("Restaurant NID: "+r3.getNid());
								c3.showAllAccounts();
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
							}
							
							
							break;
							
						case 4:
						
							break;
							
						case 5:
						
							break;
							
						default:
							System.out.println("Invalid Option............");
							break;
					}
				
					break ;
					
				case 3:
				
					System.out.println("------------------------------------");
					System.out.println("You have chosen Restaurant FoodItem Management");
					System.out.println("------------------------------------");
				
					break ;
					
				case 4:
				
					System.out.println("------------------------------------");
					System.out.println("You have chosen FoodItem Quantity Add-Sell");
					System.out.println("------------------------------------");
				
					break ;
					
				case 5:
				
					System.out.println("------------------------------------");
					System.out.println("You have chosenExit");
					System.out.println("------------------------------------");
					repeat= false;
				
					break ;
					
				default: 
				
					System.out.println("---------------------------------");
					System.out.println("Invalid choice... ");
				
					break;
					
					System.out.println("---------------------------------\n");
			}
			
			
			
			
			
		}
		
			
			
	}
}

 
