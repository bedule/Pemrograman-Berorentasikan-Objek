import java.util.Scanner;
public class totalnilaiMahasiswa {
    private double nilaiAkhir; // variabel untuk nilai akhir
    private String huruf; // variabel untuk nilai huruf

    public totalnilaiMahasiswa(){ // membuat class construction
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.print(" MASUKAN TOTAL NILAI AKHIR ANDA = \n");
        nilaiAkhir = sc.nextDouble(); // input total nilai
        System.out.println("====================================");
        System.out.println("HASILNYA ADALAH: ");
        if (nilaiAkhir >= 90 && nilaiAkhir <= 100){
            huruf = "A";
        }
        else if (nilaiAkhir >= 80 && nilaiAkhir <= 89.99){
            huruf = "A-";
        }
        else if (nilaiAkhir >= 75 && nilaiAkhir <= 79.99){
            huruf = "B+";
        }
        else if (nilaiAkhir >= 70 && nilaiAkhir <= 74.99){
            huruf = "B";
        }
        else if (nilaiAkhir >= 65 && nilaiAkhir <= 69.99){
            huruf = "B-";
        }
        else if (nilaiAkhir>= 60 && nilaiAkhir <= 64.99){
            huruf = "C+";
        }
        else if (nilaiAkhir >= 55 && nilaiAkhir <= 59.99){
            huruf = "C";
        }
        else if (nilaiAkhir >= 50 && nilaiAkhir <= 54.99){
            huruf = "C-";
        }
        else if (nilaiAkhir >= 40 && nilaiAkhir <= 49.99){
            huruf = "D";
        }
        else {
            huruf = "E";
        }
    }

    public static void main(String[] args) {
        totalnilaiMahasiswa grade = new totalnilaiMahasiswa(); // membuat objek " grade " untuk memanggil class constructor Soal4
        System.out.println(" Nilai angka = " + grade.nilaiAkhir);
        System.out.println(" Nilai huruf = " + grade.huruf);
    }

}
