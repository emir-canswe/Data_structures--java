package eklemeli_siralama;

import java.util.Iterator;
import java.util.Random;

public class mmaiiin {

	public static void main(String[] args) {
		//  secmeli siralama işlemin tam tersi denileblirm
		//secmelide buyuk sayiyi sona alama işlemi iken bunda kucukn olan sayiyi sona alama işlemidir
		//diziyinin secilen bir indexi kaydirma işlemi ile yapar
		//yani orta degeri surakli olarak basa ekleme işlemidir
		//kaydirma işlemi ile işlemler yapilir
		
		
		int [] d=new int[10];
		
		Random r=new Random();
		
		for (int i = 0; i < d.length; i++) {
			d[i]=r.nextInt(100);
		}
		
		classsss s=new classsss(d);
		System.out.println("dizinin ilk hali");
		s.yazma();
		s.ekleme();
		System.out.println("dizinin sol hali");
		s.yazma();
		
		
		

	}

}
