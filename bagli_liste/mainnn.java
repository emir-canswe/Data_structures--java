package tek_yonlu_baglli_liste;

import clllaassass.clllas;   // Düğüm sınıfı
import clllaassass.cllllas2; // Bağlı liste sınıfı

public class mainnnn {

	public static void main(String[] args) {
		cllllas2 bl = new cllllas2(); // Bağlı liste nesnesi oluşturuluyor
		
		clllas n1 = new clllas(41);   // Yeni düğümler oluşturuluyor
		clllas n2 = new clllas(44);
		clllas n3 = new clllas(456);
		clllas n4 = new clllas(4123);
		
		bl.yazma();     // Liste boşken yazma
		bl.add(n1);     // İlk düğüm ekleniyor
		bl.yazma();     // İlk düğüm eklendikten sonra liste yazdırılıyor
		bl.add(n2);     // İkinci düğüm ekleniyor
		bl.yazma();     // İkinci düğümden sonra tekrar yazdırılıyor
		bl.add(n3);  
		bl.yazma(); 
		bl.add(n4); 
		bl.yazma(); 
		// İstersen buraya n3 ve n4 de ekleyebilirsin.
	}

}
