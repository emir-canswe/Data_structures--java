package secmeli_siralama;

import java.util.Random;

import classsas.claassassssss;

public class maiiiinnn {

	public static void main(String[] args) {
		//iki sayiyi siraili bir sekil kiyaslayip en kucugu en sona alama işlemidir
		
		int [] d=new int[10];//dizi tanimla
		
		Random r=new Random();//rasgel
		
		for (int i = 0; i < 10; i++) {
			d[i]=r.nextInt(100);//random sayi uretme
		}
		
		claassassssss s=new claassassssss(d);//clasi tanimlayip metoda diziyi gonder
		System.out.println("dizinin ilk hali");
		s.yazma();
		s.secmeli_siralama();
		System.out.println("dizinin son hali");
		s.yazma();
		

	}

}
