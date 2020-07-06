package test0702.first;

import java.util.Scanner;

public class GetInputData {
	public static void main(String args[])
	{
		int num;
		float funm;
		String str;
		
		Scanner in = new Scanner(System.in);
		
		//Get input String
		System.out.println("Enter a string");
		str = in.nextLine();
		System.out.println("Input String is: " + str);
		
		//Get input float number
		System.out.println("Enter a float number");
		funm= in.nextFloat();
		System.out.println("Input Float number is:" + funm);
	}
}
