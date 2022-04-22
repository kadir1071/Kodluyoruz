import java.util.Scanner;



public class Ortalama {

    public static void main(String[] args)
    {
        int mat,fizik,turkce,kimya,tarih,müzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz");
          mat = inp.nextInt();

          System.out.println("Fizik notunuzu giriniz");
          fizik = inp.nextInt();

          System.out.println("Türkçe notunuzu giriniz");
          turkce = inp.nextInt();

          System.out.println("Kimya notunuzu giriniz");
          kimya = inp.nextInt();

          System.out.println("Tarih notunuzu giriniz");
          tarih = inp.nextInt();

          System.out.println("Müzik notunuzu giriniz");
          müzik = inp.nextInt();

          int toplam =(mat+müzik+kimya+fizik+tarih+turkce);
          double sonuc = toplam / 6;
          System.out.println("Not ortalamanız" + sonuc);
                  String cikti= (sonuc >= 60) ? "Geçti" : "Kaldı";
          System.out.println(cikti);

    }

}
