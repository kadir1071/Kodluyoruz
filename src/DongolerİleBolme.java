import java.util.Scanner;
public class DongolerİleBolme {
    public static void main(String[] args) {
         int g;
         Scanner inp=new Scanner(System.in);
         System.out.print("Sayı giriniz :");
         g=inp.nextInt();

         for(int i=1; i<=g;i++){
             if (i%3==0 && i%4==0){
                 System.out.println(i);
             }
         }
    }
}
