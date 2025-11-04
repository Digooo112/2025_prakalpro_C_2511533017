package Pekan6_2511533017;

import java.util.Scanner;

public class doWhilel_2511533017 {

	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
		String pharase;
		do {
			System.out.print("Input Password: ");
			pharase = console.next();
		} while (!pharase.equals("abcd")) ;
console.close();
	}
	
}
