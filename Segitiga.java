import java.util.Scanner;

public class Segitiga {
    // Membuat app OOP untuk menghitung luas segitiga, di mana nilai alas dan tinggi diinput melalui keyboard
    private int alas;
    private int tinggi;
    private double luas;

    public int getAlas() {
        return alas;
    }
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public Segitiga (){
        Scanner sc = new Scanner(System.in);
        System.out.print("MASUKKAN ALAS PADA SEGITIGA = "); // input alas segitiga
        alas = sc.nextInt();
        System.out.print("MASUKKAN TINGGI PADA SEGITIGA = "); // input tinggi segitiga
        tinggi = sc.nextInt();
    }
    public final double luas() {
        return 0.5 * alas * tinggi; // fungsi luas
    }

    public static void main(String[] args) {
        Segitiga luasSegitiga = new Segitiga(); // membuat objek " luasSegitiga " dari class Segitiga
        System.out.println("Luas segitiga adalah = " + luasSegitiga.luas() + " cm^2"); // tampilan luas
    }
}
