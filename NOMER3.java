import java.util.Random;
import java.util.Scanner;

public class NOMER3 {
    public static void main(String[] args){

        String[] arr = {"Jempol", "Telunjuk", "Kelingking"};
        Scanner sc = new Scanner(System.in);
        String jawab;
        String ulang;

        Random r = new Random();
        int randomNumber = r.nextInt(arr.length);
        System.out.println("SELAMAT DATANG DI GAME SUIT INDONESIA : ");

        do{
            System.out.println("PEMAIN MENGELUARKAN Jempol(J), Telunjuk(T), Kelingking(K)");
            jawab = sc.nextLine();
            System.out.println("KOMPUTER MELAWAN : " + arr[randomNumber]);
            if (arr[randomNumber].equals("Telunjuk") && jawab.equals("Jempol"))
            {
                System.out.println("ANDA GG GAMINK");
            }
            else if (arr[randomNumber].equals("Kelingking") && jawab.equals("Telunjuk"))
            {
                System.out.println("YOO NICE, YOU WIN!");
            }
            else if (arr[randomNumber].equals("Jempol") && jawab.equals("Kelingking"))
            {
                System.out.println("Kamu telah menang dan menamatkan game suit, gg adik adik");
            }
            else if (arr[randomNumber].equals(jawab))
            {
                System.out.println("Kenapa bisa seri??");
            }
            else {
                System.out.println("kalah, nt adik adik");
            }
            System.out.println("MAU MAIN LAGI GAK? [y/t]");
            ulang = sc.nextLine();
        }
        while (ulang.equals("y") || ulang.equals('Y'));
        System.out.println("yauda kalo gamau main lagi, dadahh\n");


    }
}
