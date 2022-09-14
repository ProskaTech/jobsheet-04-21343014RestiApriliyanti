/*
 * Created by 21343014_Resti Apriliyanti
 */

public class TugasTerbesar {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        int tertinggi;

        //mencari nilai tertinggi
        tertinggi = (num2 > num3) ? (num2 > num1) ? num2 : num1 : num3;

        //print status
        System.out.println("Number 1 = " +num1);
        System.out.println("Number 2 = " +num2);
        System.out.println("Number 3 = " +num3);
        System.out.println("Nilai tertingginya adalah = " +tertinggi);
    }
    
}
