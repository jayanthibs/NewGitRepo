package saucelabpackage;

import java.util.Scanner;

public class OneDimensionalArray {
	static String companyname ="GCOM Software LLC";
	
	
	static void printEmployeeDetails(int n,String name[],int id[],float salary[],float bonus[]) {
		int j=1;
		for(int i=0;i<n;i++) {
			System.out.println("Employee "+j+" Name:"+name[i]);
			System.out.println(" Id:"+id[i]);
			System.out.println(" CompanyName:"+companyname);
			System.out.println(" Salary:"+salary[i]);
			System.out.println(" Bonus:"+bonus[i]);
			System.out.println("Total Salary:"+(salary[i]+bonus[i]));
			j++;	
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Employees:");
		int n = in.nextInt();
		String name[]= new String[n];
		int id[]=new int[n];
		float salary[]=new float[n],bonus[]=new float[n];
		int j=1;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Employee "+j+" Name:");
			name[i]=in.next();
			System.out.println("Id:");
			id[i]=in.nextInt();
			System.out.println("Salary:");
			salary[i]=in.nextFloat();
			System.out.println("Bonus:");
			bonus[i]=in.nextFloat();
			j++;		
		}
		printEmployeeDetails(n, name, id, salary, bonus);
	
	}

}
