package Pekan4;

import java.util.Scanner;

public class TugasPekan4 {
    public static void main(String[] args) {
        String namaPembeli;
        int jumlahTiket;
        int hargaDasar = 40000;
        int hargaHari = 0;
        int hargaWaktu = 0;
        int hargaJenis = 0;
        int hargaPerTiket;
        int hargaTotal;
        char hari = ' ';
        char waktuTayang = ' ';
        char jenisStudio = ' ';
        String namaHari;
        String waktu;
        String namaStudio;
        String persenanHari;
        String persenanWaktu;
        String persenanStudio;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Nama pembeli : ");
        namaPembeli = keyboard.nextLine();

        System.out.print("Jumlah tiket : ");
        jumlahTiket = keyboard.nextInt();

        System.out.print("Hari (s=senin-kamis, j=jumat, u=sabtu-minggu): ");
        hari = keyboard.next().charAt(0);

        System.out.print("Waktu tayang (a=pagi, b=siang, c=malam): ");
        waktuTayang = keyboard.next().charAt(0);

        System.out.print("Jenis studio (p=regular, d=deluxe, r=premium): ");
        jenisStudio = keyboard.next().charAt(0);

        // Harga berdasarkan hari
        if (hari == 's') {
            hargaHari = (10 * hargaDasar / 100);
        } else if (hari == 'j') {
            hargaHari = (20 * hargaDasar / 100);
        } else if (hari == 'u') {
            hargaHari = (30 * hargaDasar / 100);
        }

        switch (hari) {
            case 's':
                namaHari = "senin-kamis";
                break;
            case 'j':
                namaHari = "jumat";
                break;
            case 'u':
                namaHari = "sabtu-minggu";
                break;
            default:
                namaHari = "hari tidak valid";
        }

        switch (hari) {
            case 's':
                persenanHari = "+10%";
                break;
            case 'j':
                persenanHari = "+20%";
                break;
            case 'u':
                persenanHari = "+30%";
                break;
            default:
                persenanHari = "persenan tidak valid";
        }

        // Harga berdasarkan waktu tayang
        if (waktuTayang == 'a') {
            hargaWaktu = (10 * hargaDasar / 100);
        } else if (waktuTayang == 'b') {
            hargaWaktu = (20 * hargaDasar / 100);
        } else if (waktuTayang == 'c') {
            hargaWaktu = (30 * hargaDasar / 100);
        }

        switch (waktuTayang) {
            case 'a':
                persenanWaktu = "+10%";
                break;
            case 'b':
                persenanWaktu = "+20%";
                break;
            case 'c':
                persenanWaktu = "+30%";
                break;
            default:
                persenanWaktu = "persenan tidak valid";
        }

        switch (waktuTayang) {
            case 'a':
                waktu = "Pagi 10.00 - 12.00";
                break;
            case 'b':
                waktu = "Siang 12.00 - 17.00";
                break;
            case 'c':
                waktu = "Malam 17.00 - 22.00";
                break;
            default:
                waktu = "waktu tidak valid";
        }

        // Harga berdasarkan jenis studio
        if (jenisStudio == 'p') {
            hargaJenis = hargaDasar + 10000;
        } else if (jenisStudio == 'd') {
            hargaJenis = hargaDasar + 15000;
        } else if (jenisStudio == 'r') {
            hargaJenis = hargaDasar + 20000;
        }

        switch (jenisStudio) {
            case 'p':
                persenanStudio = "+10%";
                break;
            case 'd':
                persenanStudio = "+20%";
                break;
            case 'r':
                persenanStudio = "+30%";
                break;
            default:
                persenanStudio = "persenan harga studio tidak valid";
        }

        switch (jenisStudio) {
            case 'p':
                namaStudio = "regular";
                break;
            case 'd':
                namaStudio = "deluxe";
                break;
            case 'r':
                namaStudio = "premium";
                break;
            default:
                namaStudio = "studio tidak valid";
        }

        hargaPerTiket = hargaHari + hargaWaktu + hargaJenis;
        hargaTotal = hargaPerTiket * jumlahTiket;

        System.out.println("====================================");
        System.out.println("Nama pembeli : " + namaPembeli);
        System.out.println("Jumlah tiket : " + jumlahTiket);
        System.out.println("Hari : " + namaHari);
        System.out.println("Waktu tayang : " + waktu);
        System.out.println("Studio : " + namaStudio);
        System.out.println("------------------------------------");
        System.out.println("Harga dasar = " + hargaDasar);
        System.out.println("Biaya hari = " + persenanHari);
        System.out.println("Biaya waktu = " + persenanWaktu);
        System.out.println("Biaya studio = " + persenanStudio);
        System.out.println("Harga per tiket = " + hargaPerTiket);
        System.out.println("Harga total = " + hargaTotal);
        keyboard.close();
    }
}


