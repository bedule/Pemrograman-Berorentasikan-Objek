import java.util.Scanner;

public class NO2 {
    private static float berat, tinggi, meter, BMI;

    public static void main(String []args)
    {
        Scanner NO2 = new Scanner(System.in);

        System.out.println("--------------------------------------------------------");
        System.out.println("PROGRAM JAVA OOP MENGHITUNG BERAT BADAN IDEAL DENGAN BMI");
        System.out.println("--------------------------------------------------------");
        System.out.print ("Masukan Berat: ");
        berat = NO2.nextFloat();
        System.out.print ("Masukan Tinggi: ");
        tinggi = NO2.nextFloat();
        meter=tinggi/100;

        BMI=(berat/(meter*meter));      //Body Mass Index (BMI)

        System.out.println("............................................");
        System.out.print("BMI : "+BMI+" ");

        if (BMI<18.5){
            System.out.println("(Underweight)");
        }else if (BMI <= 22.9){
            System.out.println("(Ideal)");
        }else {
            System.out.println("(Overweight)");
        }


    }
}
