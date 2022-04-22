import java.util.Scanner;


public class TaksiMetre {
    public static void main(String [] args){
        int km;
        double perKm=2.20, total =10;

        Scanner inp=new Scanner(System.in);
        System.out.print("Mesafe giriniz : ");
        km=inp.nextInt();
        total=(km*perKm);
        total += 10;

        total =(total<20) ? 20:total;
        System.out.println("Toplam Tutar : " + total);

    }
}
