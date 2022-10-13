import java.util.Scanner;

public class NOMER2 {
    public static void main(String[] args) {

        String kalimat = "Kalau dilakukan dengan sepenuh hati maka besi batangan pun kalau digosok terus menerus menjadi jarum";
        String kata;
        Scanner cek = new Scanner(System.in);

        do {
            System.out.println("Input kata yang mengandung dalam kalimat : ");
            kata = cek.nextLine();
            if (kalimat.contains(kata)) {
                System.out.println("Kata tersebut terdapat dalam kalimat");
                System.out.println(" ");
            } else {
                System.out.println("Kata tersebut tidak terdapat dalamm kalimat");
                System.out.println(" ");
            }
        } while (kalimat.contains(kata) == false);
    }
}