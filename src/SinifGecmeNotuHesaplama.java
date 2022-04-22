import java.util.Scanner;
public class SinifGecmeNotuHesaplama {
    public static void main(String[] args) {
        int fizik, matematik, kimya, biyoloji, cografya;
        double avarage;
        Scanner inp = new Scanner(System.in);

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Matematik notunuzu giriniz :");
        matematik=inp.nextInt();

        System.out.print("Kimya notunuzu giriniz :");
        kimya=inp.nextInt();

        System.out.print("Biyoloji notunuzu giriniz :");
        biyoloji=inp.nextInt();

        System.out.print("Coğrafya notunuzu giriniz :");
        cografya=inp.nextInt();

        avarage=(matematik+fizik+biyoloji+kimya+cografya)/5;

        if(avarage <= 55) {
            System.out.println("Sınıfta kaldınız, seneye görüşmek üzere");
        }else {
            System.out.println("Tebrikler Sınıfı geçtiniz");
        }

        System.out.println("Ortalamanız :" + avarage  );
    }
}