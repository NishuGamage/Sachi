package test01;

import java.util.Scanner;

public class YourDetails {
	public static void main(String args[]) {
		String s= "Hellow This is JavaTopint";
		
		//Create scanner Object and pass string in it 
		Scanner scan = new Scanner(s);
		
		//Check if the scanner has a token
		System.out.println("Boolean Result:"+scan.hasNext());
		
		//Print the string
		System.out.println("String:"+scan.nextLine());
		scan.close();
		
		System.out.println("-----Enter Your Details-------");
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your name:");
		String name = in.next();
		System.out.println("Name:"+name);
		
		System.out.print("Enter your age:");
		int i = in.nextInt();
		System.out.println("Age:"+i);
		
		System.out.print("Enter your salary:");
		double d = in.nextDouble();
		System.out.print("Salary:"+d);
		
		in.close();
		
		
	}

}
