import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.print("Lüfen sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;
        int ortalama =0;
        int bölücü = 0;
        for (int i = 0; i <= sayi; i++) {
            if (i%3==0 && i%4 == 0){
                System.out.println(i);
                toplam = toplam+i;
                bölücü++;
                ortalama = toplam/(bölücü);
            }
            else{
                toplam = toplam;
                ortalama = ortalama;
            }
        }
        System.out.println("Ortalama  ="+ortalama);
        System.out.println("Toplam = "+toplam);
        System.out.println("****************************************************");
        
    }
}
