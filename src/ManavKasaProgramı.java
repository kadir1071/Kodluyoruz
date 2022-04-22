import java.util.Scanner;


public class ManavKasaProgramı {

    public static void main(String [] args){
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;

        Scanner girdi=new Scanner (System.in);

        System.out.print("Armut Kaç kilo :");
        int Aarmut=girdi.nextInt();
        Double AAarmut=Aarmut*armut;

        System.out.print("Elma Kaç kilo :");
        int Eelma=girdi.nextInt();
        Double EEelma=Eelma*elma;

        System.out.print("Domates Kaç kilo :");
        int Ddomates=girdi.nextInt();
        Double DDdomates=Ddomates*domates;

        System.out.print("Patlıcan Kaç kilo :");
        int Ppatlican=girdi.nextInt();
        Double PPpatlican=Ppatlican*patlican;

        System.out.print("Muz Kaç kilo :");
        int Mmuz=girdi.nextInt();
        Double MMmuz=Ppatlican*patlican;

        double total=MMmuz+EEelma+AAarmut+PPpatlican+DDdomates;

        System.out.println("Toplam tutar : "+ total+"TL");

    }
}
