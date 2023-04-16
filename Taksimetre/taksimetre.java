import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        double km , tutar ;

        Scanner input = new Scanner(System.in);

        System.out.print("Katedilen yolu kilometre cinsinden yazınız : ");
        km = input.nextDouble();

        tutar = 10 + (km * 2.2);

        System.out.print("Yolculuğunuzun tutarı : " + (tutar < 20 ? (tutar = 20) : (tutar = 10 + (km * 2.2))));

        
        
    }
    
}
