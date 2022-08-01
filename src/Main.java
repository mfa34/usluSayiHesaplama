import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int taban , ust , adet=1;
        //Kullanicadan Sayilar Aliniyor ↓
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ustunu almak istediginiz sayiyi giriniz: ");
        taban = input.nextInt();
        System.out.println("Lutfen sayinizin bulmak istediginiz ustunu giriniz : ");
        ust=input.nextInt();

        //----------------------------------------------------------\\
        for (int i =1 ; i <=ust ; i ++){
            adet*=taban;
        }
        System.out.println("Sonuc = " + adet );

    }
}
