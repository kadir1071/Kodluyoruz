import java.util.Scanner;

public class KullaniciGiris {


    public static void main(String[] args) {
      String userName,Password;

      Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz :");

        userName = inp.nextLine();
        System.out.print("Şifrenizi Giriniz :");

        Password = inp.nextLine();
        if (userName.equals("Patika") && Password.equals("java123")) {
            System.out.println("Giriş Başarılı !");
        } else {
            System.out.println("Kullanıcı Bilgileri Yanlış !");
        }

    }
}
