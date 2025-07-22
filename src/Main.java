import java.util.Scanner;


    public static void main(String[] args) {
        // Scanner sınıfını kullanarak kullanıcıdan veri alıyoruz
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan 3 sayı alınır
        System.out.print("a sayısını giriniz: ");
        int a = input.nextInt();

        System.out.print("b sayısını giriniz: ");
        int b = input.nextInt();

        System.out.print("c sayısını giriniz: ");
        int c = input.nextInt();

        // İşlem:
        int sonuc = a + b * c - b;

        // Sonucu ekrana yazdır
        System.out.println("Sonuç: " + sonuc);

        // Scanner kapatılır
        input.close();
        }
    }
