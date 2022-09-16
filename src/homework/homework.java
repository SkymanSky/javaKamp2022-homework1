package homework;



public class homework {

	public static void main(String[] args) {
		System.out.println("Merhaba Dünya.");

		// Variables
		int ogranciSayisi = 12;
		String mesaj = "Öğrenci sayısı: ";
		System.out.println(mesaj + ogranciSayisi);
		System.out.println(mesaj + ogranciSayisi);
		System.out.println("Öğrenci sayım: " + ogranciSayisi);
		System.out.println("Öğrenci sayım: " + ogranciSayisi);
		System.out.println("Öğrenci sayım: " + ogranciSayisi);

		// datatypes
		byte sayi1 = 121;
		double sayi2 = 12.5;
		int sayi = 12;
		sayi = 1211111111;

		char karakter = 'A';

		boolean dogruMu = false;

		// conditionals
		int sayi3 = 24;
		if (sayi3 < 20) {
			System.out.println("Sayı 20 den küçüktür.");
		}

		if (sayi3 < 15) {
			System.out.println("Sayı 20 den küçüktür.");
		}

		if (sayi3 < 20) {
			System.out.println("Sayı 20 den küçüktür.");
		} else {
			System.out.println("Sayı 20 den küçük değildir.");
		}

		if (sayi3 < 20) {
			System.out.println("Sayı 20 den küçüktür.");
		} else if (sayi3 == 20) {
			System.out.println("Sayı 20 ye eşittir.");
		}

		if (sayi3 < 20) {
			System.out.println("Sayı 20 den küçüktür.");
		} else if (sayi3 == 20) {
			System.out.println("Sayı 20 ye eşittir.");
		} else {
			System.out.println("Sayı 20' den büyüktür.");
		}

		// ReCap Demo 1 En büyük sayı hangisi
		int sayi4 = 29;
		int sayi5 = 22;
		int sayi6 = 26;
		int enBuyukSayi = sayi4;

		if (enBuyukSayi < sayi5) {
			enBuyukSayi = sayi5;
		}

		if (enBuyukSayi < sayi6) {
			enBuyukSayi = sayi6;
		}

		System.out.println("En büyük sayi= " + enBuyukSayi);

		// Switch bloklarıyla çalışmak.
		char grade = 'G';

		switch (grade) {
			case 'A':
				System.out.println("Mükemmel: Geçtiniz");
				break;
			case 'B':
				System.out.println("Çok güzel: Geçtiniz");
				break;
			case 'C':
				System.out.println("İyi: Geçtiniz");
				break;
			case 'D':
				System.out.println("Fena Değl: Geçtiniz");
				break;
			case 'F':
				System.out.println("Maalesef Kaldınız.");
				break;
			default:
				System.out.println("Geçersiz not girdiniz.");
		}

		// döngüler
		// for
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti.");

		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti.");

		// while döngüsü
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("while döngüsü bitti.");

		int j = 1;
		while (j < 10) {
			System.out.println(j);
			j += 2;
		}
		System.out.println("while döngüsü bitti.");

		// Do while döngüsü
		int k = 100;
		do {
			System.out.println(k);
			k += 2;
		} while (k < 10);

		System.out.println("Do while döngüsü bitti.");

		// diziler
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("-----------------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		// ogrenciler[4]="Ali";

		for (int x = 0; x < ogrenciler.length; x++) {
			System.out.println(ogrenciler[x]);
		}

		System.out.println("---------------------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

		// ReCap Demo 2 - Dizilerle çalışmak

		double[] myList = { 1.2, 1.3, 4.3, 6.4 };
		double total = 0;
		double max = 0;

		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total += number;
			System.out.println(number);

		}
		System.out.println(total);
		System.out.println("En büyük sayı: " + max);

	}

}
