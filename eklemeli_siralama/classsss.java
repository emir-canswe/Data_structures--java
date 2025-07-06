package eklemeli_siralama; // Bu sınıfın bulunduğu paket adı

import java.util.Arrays; // Arrays kütüphanesini içe aktarır (dizi yazdırmak için kullanılır)

public class classsss { // classsss adında bir sınıf tanımlanıyor

	int[] dizi; // Sıralanacak diziyi tutan değişken
	int n;      // Dizinin uzunluğu (eleman sayısı)

	// Constructor: Sınıf örneği oluşturulurken dizi parametresi alınır
	public classsss(int[] d) {
		dizi = d;       // Parametre olarak gelen dizi, sınıf içindeki dizi değişkenine atanır
		n = d.length;   // Dizinin uzunluğu 'n' değişkenine atanır
	}

	// Ekleme sıralaması (Insertion Sort) algoritmasını uygular
	public void ekleme() {
		int t, j; // t: geçici olarak elemanı tutar, j: sıralama için pozisyon belirler

		// 1. elemandan itibaren tüm elemanlar sıralanır (çünkü ilk eleman zaten sıralıdır)
		for (int i = 1; i < n; i++) {
			t = dizi[i]; // Sıradaki elemanı t’ye al
			j = i;       // j'yi i konumuna ayarla

			// j > 0 olduğu sürece ve soldaki eleman büyükse sağa kaydır
			while (j > 0 && dizi[j - 1] > t) {
				dizi[j] = dizi[j - 1]; // Büyük olanı bir sağa kaydır
				j--; // j’yi bir azalt, sola doğru git
			}

			dizi[j] = t; // Doğru yere elemanı yerleştir
		}
	}

	// Diziyi ekrana yazdırmak için kullanılan metod
	public void yazma() {
		System.out.println(Arrays.toString(dizi)); // Dizinin elemanlarını ekrana bastırır
	}
}
