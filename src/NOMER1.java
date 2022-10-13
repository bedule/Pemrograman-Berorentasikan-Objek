import java.util.Scanner;

public class NOMER1 {
        public static void main(String[] args) {
            Byte angka;
            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.print("\nMasukan angka 1 - 10: ");
                angka = input.nextByte();

                if (angka >= 1 && angka <= 10) {
                    break;
                } else {
                    System.out.println("Angka Anda bukan 1 - 10, COBA MASUKAN ULANG");
                }
            }
            System.out.println("Angka Anda berada di 1 - 10");
    }
}