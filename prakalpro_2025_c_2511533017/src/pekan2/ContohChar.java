package pekan2;

public class ContohChar {
	public static void main(String[] args) {
	// Deklarasi variable char
	char huruf1 = 'A';
	char huruf2 = 'B';
	char angka = '7';
	char simbol = '#';
	
	// Menampilkasn nilai variable char
	System.out.println("Contoh variable char: ");
	System.out.println("Huruf pertama: " + huruf1);
	System.out.println("Hhuruf kedua: " + huruf2);
	System.out.println("Angka: " + angka);
	System.out.println("Simbol: " + simbol);
	
	// Operasi dengan char (bedasarkan kode Umicode/ASCII)
	char huruf3 = (char) (huruf1 + 1); // A (65) + 1 = B (66)
	System.out.println("Huruf1 + 1 = " + huruf3);
	
	// Chat juga bisa disimpan dalam integer (ASCII/Unicode value)
	int kodehuruf = huruf1;
	String binerl = String.format("%8s", Integer.toBinaryString(huruf1)).replace(' ', '0');
	System.out.println("Kode ASCTII dari " + huruf1 + " = " + kodehuruf);
	System.out.println("Kode BINER dari " + huruf1 + " = " + binerl);
	
	// Menggabungkan char menjadi string
	String kata = "" + huruf1 + huruf2 + angka + simbol;
	System.out.println("Gabungan char menjadi string: " + kata);
	
	
	
	
	}


}
