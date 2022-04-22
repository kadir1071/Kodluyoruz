import java.util.Scanner;

public class VucütKitleİndeks {
    public static void main(String [] args){
       double boy,sonuc;
       int kilo;
       Scanner girdi=new Scanner(System.in);

       System.out.print("Lütfen boyunuzu giriniz : ");
       boy=girdi.nextInt();

       System.out.print("Lütfen kilonuzu giriniz :");
       kilo=girdi.nextInt();

       sonuc=boy/(kilo*kilo);

       System.out.print("Vücut kitle indeksiniz "+sonuc);


    }
}
