import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik Problemleri");

        String islemler = "\nIslemler...\n"
                + "1.Daire Alani Hesaplama \n"
                + "2.Ucgen Cevresi Hesaplama\n"
                + "3.Kare Alani Hesaplama\n"
                + "Cikis : q \n";

        while (true) {
            System.out.println(islemler);
            System.out.print("Islemi seciniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan cikiliyor...");
                break;
            }


            else if (islem.equals("1")) {
                System.out.print("Dairenin yaricapi: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();    //scanner daki hatayı engellemek için

                Problem.Matematik.daireAlan(yaricap);


            }

            else if (islem.equals("2")) {
                System.out.print("Kenar 1 :");
                int ucgenKenar1 = scanner.nextInt();
                System.out.print("Kenar 2 :");
                int ucgenKenar2 = scanner.nextInt();
                System.out.print("Kenar 3 :");
                int ucgenKenar3 = scanner.nextInt();
                scanner.nextLine();


                Problem.Matematik.ucgenCevresi(ucgenKenar1, ucgenKenar2, ucgenKenar3);


            }

            else if (islem.equals("3")) {
                System.out.print("Kenar : ");
                int kareKenar = scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.kareAlani(kareKenar);
                break;

            }

            else {
                System.out.println("Hatali islem");
            }

        }

    }
}