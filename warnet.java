import java.util.Scanner;

public class warnet {
    static double bayarngetik(double ngetik)
    {
        return (ngetik/60) * 2000;
    }
    static double bayarinet(double inet) {
        return (inet/60) * 4000;
    }
    static double bayargaming(double gaming) {
        return (gaming/60) * 5000;
    }
    static double bayarprintcolor(int cetakwarna) {
        return cetakwarna*500;
    }
    static double bayarprintgray(int cetakgray) {
        return cetakgray*300;
    }
    static double bayarjajan(int jajan) {
        return jajan*3000;
    }
    static double bayarscan(int scan) {
        return scan*1000;
    }
    static double totalbayar(int ngetik, int gaming, int inet, int cetakwarna, int cetakgray, int jajan, int scan)
    {
        return bayargaming(gaming) + bayarinet(inet) + bayarjajan(jajan) + bayarscan(scan) + bayarprintgray(cetakgray) + bayarngetik(ngetik) + bayarprintcolor(cetakwarna);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ngetik;
        System.out.print("Lama User di Warnet Mengetik dalam menit = ");
        ngetik = sc.nextInt();
        System.out.print(bayarngetik(ngetik));
        System.out.println(" ");
        int inet;
        System.out.print("Lama User Menggunakan Internet di Warnet dalam menit = ");
        inet = sc.nextInt();
        System.out.print(bayarinet(inet));
        System.out.println(" ");
        int gaming;
        System.out.print("Lama User Main Game-Online di Warnet dalam menit = ");
        gaming = sc.nextInt();
        System.out.print(bayargaming(gaming));
        System.out.println(" ");
        int cetakwarna;
        System.out.print("Banyak User Cetak Berwarna di Warnet = ");
        cetakwarna = sc.nextInt();
        System.out.print(bayarprintcolor(cetakwarna));
        System.out.println(" ");
        int cetakgray;
        System.out.print("Banyak User Cetak Hitam-Putih di Warnet= ");
        cetakgray = sc.nextInt();
        System.out.print(bayarprintgray(cetakgray));
        System.out.println(" ");
        int jajan;
        System.out.print("Banyak Teh Botol Yang Dibeli User di Warnet= ");
        jajan = sc.nextInt();
        System.out.print(bayarjajan(jajan));
        System.out.println(" ");
        int scan;
        System.out.print("Banyak File Yg Discan User di Warnet = ");
        scan = sc.nextInt();
        System.out.print(bayarscan(scan));
        System.out.println(" ");
        System.out.printf("Biaya yang harus dibayar user Rp " + totalbayar(ngetik, gaming, inet, cetakwarna, cetakgray, jajan, scan));
    }
}