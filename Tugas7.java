import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormatSymbols;

public class Tugas7 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        DecimalFormat komagamink = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        String nama;
        int golongan, jamker, jamlem, gajpok, gajlem, tunjangan;
        double pajakgapok, totpajak, gajibersih;

        System.out.println("-------------------------------------------------");
        System.out.println("MENGHITUNG GAJI KARYAWAN");
        System.out.println("-------------------------------------------------");

        System.out.print("Masukan Nama : ");
        nama=masukan.nextLine();
        System.out.println("MASUKAN GOLONGAN YANG ADA 1/2/3/4");
        System.out.print("Golongan : ");
        golongan=masukan.nextInt();
        System.out.print("Masukan Jam Kerja : ");
        jamker=masukan.nextInt();

        switch (golongan) {
            case 1 -> {
                gajpok = 1486500;
                tunjangan = 250000;
            }
            case 2 -> {
                gajpok = 1926000;
                tunjangan = 300000;
            }
            case 3 -> {
                gajpok = 2456700;
                tunjangan = 350000;
            }
            case 4 -> {
                gajpok = 2899500;
                tunjangan = 400000;
            }
            default -> {
                gajpok = 0;
                tunjangan = 0;

            }

        }

        if (jamker > 173){
            jamlem=jamker - 173;
        }else{
            jamlem = 0;
        }

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        komagamink.setDecimalFormatSymbols(formatRp);

        gajlem = jamlem * 20000;
        pajakgapok = 0.05 * gajpok;
        totpajak = pajakgapok;
        gajibersih = ((gajpok+tunjangan+gajlem)-totpajak);


        System.out.println("-------------------------------------------------");
        System.out.println("Nama anda            : "+ nama);
        System.out.println("Gaji Pokok           : "+ komagamink.format(gajpok));
        System.out.println("Gaji Lembur          : "+ komagamink.format(gajlem));
        System.out.println("Pajak Gaji Pokok     : "+ komagamink.format(pajakgapok));
        System.out.println("Tunjangan Anda       : "+ komagamink.format(tunjangan));
        System.out.println("Gaji Diterima        : "+ komagamink.format(gajibersih));
        System.out.println("-------------------------------------------------");
    }

}