package test01;

import java.util.Scanner;

public class Hello {
	public static void main(String args[]) {
		String str= "Hello/This is JavaTpoint/My name is Nishu.";
		//Create  scanner with the specified String Object
		Scanner scanner = new Scanner(str);
		System.out.println("Boolean Result:" + scanner.hasNextBoolean());
		//Change the delimiter of the scanner
		scanner.useDelimiter("/");
		//Printing the tokenized Strings
		System.out.println("---Tokenizes String---");
		while(scanner.hasNext()){
			System.out.println(scanner.next());
		}
		//Display the new delimiter
		System.out.println("Delimiter used:"+scanner.delimiter());
		scanner.close();
	}

}

