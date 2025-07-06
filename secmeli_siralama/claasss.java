package classsas;

import java.util.Arrays;


public class claassassssss {
	int []  dizi;//dizi tanimlama islemi
	
	
	public claassassssss(int [] d) {
		dizi=d;
	}//dizi tanimlama islimini beliri
	//ikili arama islemi i
	public void secmeli_siralama() {
		int min=0;//
		int c;
		for (int i = 0; i < dizi.length; i++) {
			min=i;
			for (int j = i+1; j < dizi.length; j++) {
				if (dizi[j]<dizi[min]) {//en kucuk sayiyi bulup indexsini min degerinie ataca
					min=j;
				}
			}
				c=dizi[i];
				dizi[i]=dizi[min];
				dizi[min]=c;
			
		}
		
	}
	
	
	public void yazma() {
		System.out.println(Arrays.toString(dizi));
	}
	
	
	
}
