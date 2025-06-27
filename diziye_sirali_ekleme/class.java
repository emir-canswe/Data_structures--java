package sayfa;

public class clas {

	int[] dizi; // Dizi tanımlanıyor
	int es; // Dizideki mevcut eleman sayısı (es = eleman sayısı)

	// Constructor: dizinin boyutu belirleniyor
	public clas(int boyut) {
		dizi = new int[boyut]; // Belirtilen boyutta dizi oluşturuluyor
		es = 0; // Başlangıçta dizi boş
	}

	// Sıralı şekilde diziye eleman ekleyen fonksiyon
	public void ekleme(int a) 
	{
		if (es >= dizi.length) 
		{ // Dizi doluysa uyarı ver
			System.out.println("dizi dolu");
		} else 
		{
			int i;
			// Dizinin sonundan başa doğru giderek eklenmek istenen sayıdan büyük olanları
			// sağa kaydır
			for (i = es - 1; i >= 0 && dizi[i] > a; i--) 
			{
				dizi[i + 1] = dizi[i]; // Sağ kaydırma işlemi
			}
			dizi[i + 1] = a; // Yeni sayı uygun yere yerleştirilir
			es++; // Eleman sayısı arttırılır
		}
	}

	// Verilen sayıyı dizide arar, varsa index'ini döner, yoksa -1 döner
	public int arama(int a) {
		for (int i = 0; i < es; i++) { // Yalnızca dolu elemanlar arasında ara
			if (dizi[i] == a) {
				return i; // Aranan sayı bulunduğunda index'i döndür
			}
		}
		return -1; // Sayı bulunamadıysa -1 döner
	}

	// Verilen sayıyı diziden siler
	public void silme(int a) {
		int indis = this.arama(a); // Sayının index'i bulunur

		if (indis == -1) { // Sayı dizide yoksa
			System.out.println("silmek istedigin sayi yok");
		} else {
			// Silinecek sayıdan sonraki tüm elemanlar bir sola kaydırılır
			for (int i = indis; i < es - 1; i++) {
				dizi[i] = dizi[i + 1];
			}
			es--; // Eleman sayısı azaltılır
			dizi[es] = 0; // Son eleman sıfırlanır (temizlenir)
		}
	}

	// Belirtilen eski sayıyı yeni sayı ile günceller
	public void guncelle(int eski, int yeni) {
		int indis = this.arama(eski); // Güncellenecek sayı bulunur

		if (indis == -1) {
			System.out.println("guncellemek istedigin sayi yok");
		} else {
			dizi[indis] = yeni; // Yeni sayı ile güncellenir (sıralama bozulabilir)
		}
	}

	// Dizideki tüm elemanları ekrana yazdırır
	public void yazma() {
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
	}
}
