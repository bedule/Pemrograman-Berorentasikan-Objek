import java.util.Scanner;

public class NO3 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        input prh = new input();

        prh.bilangan();
        prh.hasil();
        }

    }

 class input {
     private static Byte angka;
     private static int bilangan, jumlah = 0;

     public void hasil() {

         System.out.println("hasil dari penjumlahan bilangan-bilangan: " + jumlah);
     }
     public void bilangan() {
         Scanner sc = new Scanner(System.in);

         for (angka = 1; angka <= 10; angka++) {
             System.out.print("Input Angka: ");
             bilangan = sc.nextInt();
             jumlah += bilangan;

         }
     }
}