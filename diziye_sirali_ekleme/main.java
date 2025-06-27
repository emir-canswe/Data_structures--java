package diziye_sirali_ekleme; // Paket adı

import sayfa.clas; // clas sınıfını içe aktarıyoruz

public class main {

	public static void main(String[] args) {

		clas d = new clas(6); // 6 elemanlık bir dizi oluşturuluyor

		// Diziye elemanlar sırayla ekleniyor
		d.ekleme(123);
		d.ekleme(23);
		d.ekleme(2);
		d.ekleme(10);
		d.ekleme(23);
		d.ekleme(234343456);

		d.yazma(); // Dizinin içeriği ekrana yazdırılıyor
	}
}
