package classyan;

import java.util.Arrays;

public class class_kismi {

	// kabarcik arama bir dizideki iki tane sayiyi sirali olarak kiyaslama islemine tabi tutar
	// iç içe iki tane dongu kullanir
	// iç dongu işlemi yapan dongudur
	// dış dongu ile bu işlemin kac defa yapilacagini belirtir

	int[] dizi; // dizi tanimlama işlemi

	public class_kismi(int[] d) {
		dizi = d; // main kismindan otomatik olarak atama islemi yapiliyor
	}

	public void siralama() {
		int c;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length - 1; j++) { // ✅ HATA DÜZELTİLDİ
				if (dizi[j] > dizi[j + 1]) {
					// yer degiştirme işlemi yapilan yer
					c = dizi[j];
					dizi[j] = dizi[j + 1];
					dizi[j + 1] = c;
				}
			}
		}
	}

	public void yazma() {
		System.out.println(Arrays.toString(dizi));
	}
}
