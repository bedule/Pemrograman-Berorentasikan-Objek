package menghitungLuas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hitung luas segitiga...
        luasSegitigadanLingkaran.Segitiga segitiga = new luasSegitigadanLingkaran.Segitiga();

        // input field dalam segitiga
        System.out.println("==================================================");
        System.out.println("RUMUSNYA LUAS SEGITIGA = 0.5 * alas * tinggi");
        System.out.println("==================================================");

        System.out.print("Masukan alas segitiga: ");
        segitiga.setAlas(sc.nextInt());

        System.out.print("Masukan tinggi segitiga: ");
        segitiga.setTinggi(sc.nextInt());

        // tampilkan luasnya
        System.out.println("Luas segitiga: " + segitiga.hitungLuas() + " cm^2\n\n");

        // hitung luas lingkaran...
        luasSegitigadanLingkaran.Lingkaran lingkaran = new luasSegitigadanLingkaran.Lingkaran();

        // input field dalam lingkaran
        System.out.println("==================================================");
        System.out.println("RUMUS LUAS LINGKARAN = phi * jarijari * jarijari");
        System.out.println("==================================================");

        System.out.print("Masukan jari-jari lingkaran: ");
        lingkaran.setJariJari(sc.nextInt());

        // tampilkan luasnya...
        System.out.printf("Luas lingkaran: %.2f ", lingkaran.hitungLuas());
        sc.close();
    }
}
