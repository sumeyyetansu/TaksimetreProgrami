import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.

         */

        System.out.println("Hoşgeldiniz");
        System.out.println("Taksimetre açılış ücreti 10 TL'dir.");
        System.out.println("Taksimetre KM başına 2.20 TL tutmaktadır");
        System.out.println("Minimum ödenecek tutar 20 TL'dir. 20 TL altındaki ücretlerde yine 20 TL alınacaktır.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç KM gideceksiniz : ");
        double km = scanner.nextDouble();
        double tutar = (km * 2.20) + 10 ;


        System.out.println(tutar < 20? "Ödenecek tutar: 20 Tl'dir." :"Ödenecek tutar : " + tutar);
        

    }
}
