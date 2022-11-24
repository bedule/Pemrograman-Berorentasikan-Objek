package m12crud;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean lanjutkan = true;

        while (lanjutkan) {
            clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1. \t Lihat seluruh buku");
            System.out.println("2. \t Cari data buku");
            System.out.println("3. \t Tambah data buku");
            System.out.println("4. \t Ubah data buku");
            System.out.println("5. \t Hapus data buku");

            System.out.print("\n\nPILIHAN ANDA : ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n==================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("===================");
                    tampilkanData();
                    //tampilkan data
                    break;
                case "2":
                    System.out.println("\n==============");
                    System.out.println("CARI DATA BUKU");
                    System.out.println("===============");
                    //cari data
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("=================");
                    //tambah data
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("===============");
                    //ubah data
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    //hapus data
                    break;
                default:
                    System.out.println("\n INPUT ANDA TIDAH DI TEMUKAN \n SILAHKAN PILIH (1-5)");
            }

            lanjutkan = getYesorNo("APAKAH ANDA INGIN MELANJUTKAN");
        }

    }
    private static void tampilkanData() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;

        try{
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        }catch (Exception e){
            System.err.println("DATA BASE TIDAK DITEMUKAN");
            System.err.println("Silahkan tambah data terlebih dahulu");
            return;
        }


        System.out.println("\n|NO  | \t Tahun | \t Penulis                | \t Penerbit               | \t Judul Buku");
        System.out.println("------------------------------------------------------------------------------------------");

        String data = bufferInput.readLine();
        int nomerData = 0;

        while (data != null) {
            nomerData++;

            StringTokenizer stringToken = new StringTokenizer(data, ",");

            stringToken.nextToken();
            System.out.printf("| %2d ", nomerData);
            System.out.printf("|\t %4s  ", stringToken.nextToken());
            System.out.printf("|\t %-20s   ", stringToken.nextToken());
            System.out.printf("|\t %-20s   ", stringToken.nextToken());
            System.out.printf("|\t %s   ", stringToken.nextToken());
            System.out.print("\n");
            data = bufferInput.readLine();
        }

        System.out.println("------------------------------------------------------------------------------------------");
    }
    private static boolean getYesorNo (String messege){
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("\n" + messege + " (y/n) ?");
        String pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") &&  !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Pilihan anda bukan y atau n");
            System.out.println("\n" + messege + " (y/n) ?");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    private static void clearScreen(){
        try{
            if (System.getProperty("os.name").contains("windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }
            else{
                System.out.println("\033\143");
            }
        } catch (Exception ex){
            System.err.println("TIDAK BISA CLEAR SCREEN");
        }
    }
}