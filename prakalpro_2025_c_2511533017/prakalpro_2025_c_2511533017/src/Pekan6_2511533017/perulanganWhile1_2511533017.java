package Pekan6_2511533017;

import java.util.Scanner;

public class perulanganWhile1_2511533017 {

	public static void main(String[] args) {
		
		int counter=0;
		String jawab;
		boolean running = true;
		//deklarasi Scanner
		Scanner scan = new Scanner(System.in);
		while (running) {
			counter++;
			System.out.println("jumlah + "+counter);
			System.out.print("Apakah lanjut (ya / tidak?)");
			jawab= scan.nextLine();
			//cek jawab = tidak,perulangan berhenti
			if (jawab.equalsIgnoreCase("tidak")) {
				running= false;
				
			}
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak "+counter+" kali");
		scan.close();
	

	}

}
