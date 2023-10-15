import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullanıcıAdı, sifre, yenı, y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        kullanıcıAdı = scanner.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        sifre = scanner.nextLine();

        if (kullanıcıAdı.equals("patika") && sifre.equals("java123")) {
            System.out.println("Doğru Giriş Yaptınız");
        } else if (sifre != "java123") {
            System.out.println("Şifre Sıfırlamak İster misiz?: ");
            y = scanner.nextLine();

            if (y.equals("evet")) {
                System.out.println("Yeni Şifreniz, eski şifre ile aynı olmasın!");
                //    else System.out.println("Eski şifreyi girebilir veya yenilebilirsiniz");

                System.out.print("Yeni Şifreyi Giriniz: ");
                yenı = scanner.nextLine();

                if (yenı.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                } else System.out.println("Yeni Şifre oluşturuldu");
                
            }

        }
    }
}




