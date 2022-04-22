import java.util.Scanner;

public class Aa {
    public static void main(String[] args) {
        int day, month;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ayı giriniz :");
        month = inp.nextInt();
        System.out.print("Gün Giriniz :");
        day = inp.nextInt();
        if (month==1){
            if(day >= 1 && day <=31 ){
                if (day < 22){
                    System.out.println("Oğlak burcu");
                }else{
                    System.out.println("Kova Burcu");
                }

            }
        }
    }
}
