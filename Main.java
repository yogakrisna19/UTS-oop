import java.util.Scanner;

//I Komang Yoga Krisna (21102059) Prodi SK
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        helikopter helikopter  = new helikopter();
        Pesawat pesawat = new Pesawat();



        System.out.println("Masukkan namamu");
        String UserName = scanner.nextLine();
        System.out.println("Halo " + UserName +" Ini adalah contoh program OOP sederhana ");
        System.out.println("yang akan menampilkan informasi tentang helikopter dan pesawat");


        System.out.println("1.helikopter");
        System.out.println("2.pesawat");
        System.out.println("Masukkan pilihan mu :");
        int pilihan = scanner.nextByte();

        if (pilihan == 1){
            System.out.println("Kamu memilih pesawat maka : ");

            pesawat.maju();
            pesawat.belok();
            pesawat.pabrikasal();
            pesawat.kecepatanpesawat();

        }
        else if (pilihan == 2){
            System.out.println("Kamu memilih helikopter maka : ");

            helikopter.terbanghelikopter();
            helikopter.naikhelikopter();
            helikopter.pabrikasal();
            helikopter.kecepatanhelikopter();

        }
        else {
            System.out.println("Maaf pilihan yang anda maksud tidak terdaftar");
        }




    }
}