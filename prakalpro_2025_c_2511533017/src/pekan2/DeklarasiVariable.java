package pekan2;

public class DeklarasiVariable {
	/* program java 
	 * latihan 
	 * tentang pendeklarasian variable
	 */
	static int umur=25; /* variable dapat langsung diinisasi */
	public static void main(String[] args) {
		int kode;
		boolean isDibawahUmur; /* perhatikan penulisan nama variable */
		kode = 1234; /* pengisisan variable (assigment)*/
		double gaji; /* deklarasi variable dapat diamana saja */
		gaji = 5500000.23;
		isDibawahUmur = true;
		System.out.println("status: "+isDibawahUmur);
		System.out.println("kode"+kode);
		System.out.println("umur:"+umur);
		System.out.println("gaji:"+gaji);
	}

}
