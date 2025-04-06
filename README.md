# SinemaKayitSistemi

Bu proje, sinema bilet satış sisteminin birnevi simülasyonudur. Kullanan kullanıcı, film ve müşteri tanımlayarak bilet kaydını yapmasını sağlar.

## Özellikleri
### *Film Tanımlama/Ekleme*
- Film adı, süresi ve türü girilerek filmin kaydı oluşturulur.
- En fazla 10 film tanımlanabilir.
### *Müşteri Kaydı* 
- Müşteri adı ve e-posta adresi ile kayıt oluşturulur.
- En fazla 20 müşteri kaydı yapılabilir.
### *Bilet Kaydı*
- Önce müşteri ve film seçimi yapılır.
- Her müşteri, istediği filme bilet kaydı yaptırabilir.
### *Bilet Listeleme*
- Kaydı yapılan müşterilerin hangi filmlere bilet aldıkları listelenir.

## Neler Kullandım?
### 1. Genel Yapı (class)
#### public class SinemaKayitSistemi
Projenin tüm kodlarını tek bir sınıf içerisinde topladım.
### 2. Diziler (Arrays)
#### String[] filmler, int[] sureler, String[] turler
Film bilgilerini saklamak için bunu kullandım. Filmin adı, süresi ve türü ayrı ayrı arraylerde tutuldu.
#### String[] musteriler, String[] emailler
Müşteri adları ve e-posta adresleri için array oluşturdum.
#### int[][] biletler
Biletleri takip etmek için 2 boyutlu array kullandım. [müsteri][film] şeklinde tutulur. 1 ise o müşterinin o filme bileti vardır.
### 3. Sayaçlar
#### int filmSayisi, int musteriSayisi
Film ve müşteri ekledikçe dizinin kaçıncı dizine yazılacağını takip etmek için sayaçları kullandım.
### 4. Kullanıcıdan Girdi (Scanner)
#### Scanner scanner = new Scanner(System.in);
Kullanıcıdan giriş almak için Scanner sınıfını kullandım.
### 5. Döngü (do-while)
Ana menüyü sürekli gösterebilmek adına do-while döngüsünü kullandım.
Böylelikle kullanıcı 0 girene kadar program çalışmaya devam eder.
### 6. Switch-Case Yapısı
Menü seçimlerini kontrol edebilmek adına switch-case kullandım. Her numara farklı bir işlemi temsil ediyor.
### 7. Koşul İfadeleri (if-else)
- Maksimum sınır kontrolü (10 film, 20 müşteri)
- Geçerli dizin girilip girilmediğinin kontrolünü ekledim.
- Bilet kaydı sırasında gerekli bilgilerin olup olmadığının kontrolünü ekledim.
### 8. Fonksiyonlar 
Kodun daha düzenli ve okunabilir olması için her işleme ayrı bir fonksiyon kullandım.
#### filmTanimla, musteriKaydi, biletKaydi, biletleriListele 
Bunlar sayesinde kodun kendini tekrar etmemesini sağladım, ayrıca karmaşıklığı azalttım.
