import java.util.Scanner;

public class SinemaKayitSistemi {

    static String[] filmler = new String[10];
    static int[] sureler = new int[10];
    static String[] turler = new String[10];
    static int filmSayisi = 0;

    static String[] musteriler = new String[20];
    static String[] emailler = new String[20];
    static int musteriSayisi = 0;

    static int[][] biletler = new int[20][10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("\n--- SİNEMA KAYIT SİSTEMİ ---");
            System.out.println("1. Film Tanımla");
            System.out.println("2. Müşteri Kaydı");
            System.out.println("3. Bilet Kaydı");
            System.out.println("4. Biletleri Listele");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1 -> filmTanimla(scanner);
                case 2 -> musteriKaydi(scanner);
                case 3 -> biletKaydi(scanner);
                case 4 -> biletleriListele();
                case 0 -> System.out.println("Çıkış yapılıyor...");
                default -> System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }

        } while (secim != 0);

        scanner.close();
    }

    // Film Ekleme İşlemi //
    private static void filmTanimla(Scanner scanner) {
        if (filmSayisi >= filmler.length) {
            System.out.println("Film limiti doldu.");
            return;
        }

        System.out.print("Film adı: ");
        filmler[filmSayisi] = scanner.nextLine();

        System.out.print("Süresi (dk): ");
        sureler[filmSayisi] = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Türü: ");
        turler[filmSayisi] = scanner.nextLine();

        System.out.println("Film kaydedildi.");
        filmSayisi++;
    }

    // Müşteri Kayıt İşlemi //
    private static void musteriKaydi(Scanner scanner) {
        if (musteriSayisi >= musteriler.length) {
            System.out.println("Müşteri limiti doldu.");
            return;
        }

        System.out.print("Müşteri adı: ");
        musteriler[musteriSayisi] = scanner.nextLine();

        System.out.print("Email: ");
        emailler[musteriSayisi] = scanner.nextLine();

        System.out.println("Müşteri kaydedildi.");
        musteriSayisi++;
    }

    // Bilet Kayıt İşlemi //
    private static void biletKaydi(Scanner scanner) {
        if (musteriSayisi == 0 || filmSayisi == 0) {
            System.out.println("Önce müşteri ve film eklenmelidir.");
            return;
        }

        System.out.println("--- MÜŞTERİLER ---");
        for (int i = 0; i < musteriSayisi; i++) {
            System.out.println(i + ". " + musteriler[i]);
        }

        System.out.print("Müşteri numarası: ");
        int mNo = scanner.nextInt();

        System.out.println("--- FİLMLER ---");
        for (int i = 0; i < filmSayisi; i++) {
            System.out.println(i + ". " + filmler[i]);
        }

        System.out.print("Film numarası: ");
        int fNo = scanner.nextInt();

        if (mNo < musteriSayisi && fNo < filmSayisi) {
            biletler[mNo][fNo] = 1;
            System.out.println("Bilet başarıyla kaydedildi.");
        } else {
            System.out.println("Geçersiz giriş. Lütfen tekrar deneyin.");
        }
    }

    // Biletleri Listeleme // 
    private static void biletleriListele() {
        System.out.println("\n--- BİLET LİSTESİ ---");
        for (int i = 0; i < musteriSayisi; i++) {
            System.out.print(musteriler[i] + ": ");
            boolean biletVar = false;

            for (int j = 0; j < filmSayisi; j++) {
                if (biletler[i][j] == 1) {
                    System.out.print(filmler[j] + " | ");
                    biletVar = true;
                }
            }

            if (!biletVar) {
                System.out.print("Bilet bulunamadı.");
            }

            System.out.println();
        }
    }
}
