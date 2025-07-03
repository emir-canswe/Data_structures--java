package kabarcik_arama;

import java.util.Random;
import classyan.class_kismi;

public class maiiinnn {

	public static void main(String[] args) {
		// kabarcik arama 

		int[] d = new int[10]; // dizi olusturma islemi

		Random r = new Random(); // rasgele sayi olsutırma islmemi

		for (int i = 0; i < 10; i++) {
			d[i] = r.nextInt(100); // diziye random sayi ekleme
		}

		class_kismi a = new class_kismi(d); // diziyi classa gonder
		System.out.println("Sıralamadan önce:");
		a.yazma();
		a.siralama();
		System.out.println("Sıralamadan sonra:");
		a.yazma();
	}
}
