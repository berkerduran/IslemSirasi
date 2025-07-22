# 📌 Proje Adı: Aritmetik İşlem Hesaplayıcı

## 🧮 Açıklama

Bu basit Java uygulaması, kullanıcıdan 3 adet tam sayı (`a`, `b`, `c`) alarak aşağıdaki işlemi gerçekleştirir:

```
a + b * c - b
```

Java'da işlem önceliği kurallarına göre önce çarpma, sonra toplama ve çıkarma işlemleri yapılır. Sonuç kullanıcıya gösterilir.

## 🛠️ Kullanılan Teknolojiler

- Java (JDK 8 ve üzeri)
- Scanner sınıfı (kullanıcıdan veri almak için)

## 📋 Nasıl Çalışır?

1. Program başlatılır.
2. Kullanıcıdan sırasıyla `a`, `b` ve `c` sayıları istenir.
3. Girilen sayılarla `a + b * c - b` işlemi yapılır.
4. Sonuç ekranda gösterilir.

## 💻 Örnek Kullanım

```
a sayısını giriniz: 2
b sayısını giriniz: 3
c sayısını giriniz: 4
Sonuç: 11
```

**İşlem Açıklaması:**
```
2 + 3 * 4 - 3
= 2 + 12 - 3
= 11
```

## 📌 Notlar

- `Scanner` sınıfı ile kullanıcıdan veri alınır.
- İşlem önceliği kurallarına uygun şekilde hesaplama yapılır.
- Kod sonunda `Scanner` nesnesi kapatılmıştır.
