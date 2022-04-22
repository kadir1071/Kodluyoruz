import java.util.Scanner;

public class KdvTutarHesaplama {
    public static void main(String[] args){
        double tutar,KdvOran=0.18,KdvTutar,KdvliTutar;

        Scanner girdi=new Scanner(System.in);

        System.out.print("Ücret Tutarını giriniz :");
        tutar = girdi.nextInt();

        KdvTutar=tutar*KdvOran;
        KdvliTutar=tutar+KdvTutar;

        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Oranı : " + KdvOran);
        System.out.println("KDV Tutarı :" + KdvTutar);
        System.out.println("KDV'li Tutar : "+ KdvliTutar+"TL");

    }
}
