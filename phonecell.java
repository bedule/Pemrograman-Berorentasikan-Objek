import java.util.Scanner;
public class phonecell {

    public int convertJam (int x, int y){
        return (x-y)*3600;
    }
    public int convertMenit (int x, int y){
        return  (x-y)*60;
    }
    public int convertDetik (int x, int y){
        return  x-y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        phonecell p = new phonecell();
        int bayarPulsa=150;
        int jamAwal, menitAwal,detikAwal, jamBerakhir,menitBerakhir,detikBerakhir, jam,menit,detik;
        System.out.println("========================");
        System.out.print("Masukan jam awal telponan: "); jamAwal= sc.nextInt();
        System.out.print("Masukan menit awal telponan: "); menitAwal= sc.nextInt();
        System.out.print("Masukan detik awal telponan: "); detikAwal= sc.nextInt();
        System.out.println("Waktu awal telpon telponan: " + jamAwal + " : " + menitAwal + " : " + detikAwal);
        System.out.println("========================");
        System.out.print("Masukan jam akhir telponan: "); jamBerakhir= sc.nextInt();
        System.out.print("Masukan menit akhir telponan: "); menitBerakhir= sc.nextInt();
        System.out.print("Masukan detik akhir telponan: "); detikBerakhir= sc.nextInt();
        System.out.println("Waktu akhir telpon telponan: "+ jamBerakhir + " : " + menitBerakhir + " : " + detikBerakhir);
        System.out.println("========================");
        jam=p.convertJam(jamBerakhir,jamAwal );
        menit=p.convertMenit(menitBerakhir,menitAwal);
        detik=p.convertDetik(detikBerakhir,detikAwal);
        System.out.println("Total pulsa yang dikurangi : Rp."+(jam+detik+menit)*bayarPulsa+",00-");
        System.out.println("Waktu yang digunakan "+(jamBerakhir-jamAwal)+" : "+(menitBerakhir-menitAwal)+" : "+(detikBerakhir-detikAwal));
    }
    }
