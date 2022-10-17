package Lingkaran;
import java.util.Scanner;

public class isilingkaran {
    public void lingkaran(int jari){
        double luas,keliling;
        Scanner isilingkaran = new Scanner(System.in);
        System.out.println("Lingkaran");
        System.out.println("===================");
        System.out.print("Masukkan jari - jari : ");
        jari = isilingkaran.nextInt();

        luas = (float)Math.PI*jari*jari;
        keliling = (float)2*Math.PI*jari;

        System.out.println(" ");
        System.out.printf("Luas Lingkaran adalah : %.2f" , luas , " CM^2");
        System.out.println(" ");
        System.out.printf("Keliling Lingkaran adalah : %.2f" , keliling , " CM");
    }
}
