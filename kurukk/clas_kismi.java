package classs;

import java.util.Arrays;
import java.util.Queue;

public class claass {
	int [] q;//dizi tanimlama islmi
	int es;
	
	public claass(int boyut) {
		q=new int[boyut];//dizi tanimlama islemi
		es=0;//eleman sayisiini baslangicta 0 olarak ata
	}

	
	public void push(int a) {//kuyruga ekleme işlemi
		if (es==q.length) {
			System.out.println("kuyruk dolu");
		}
		else {
			q[es]=a;//sirali bir sekilde eleman ekleme işlemi
			es++;//gelecek yeni sayi için eleman sayisini 1 artir
		}
	}
	
	public int pop() {//kuyruktan cikarma işlemi
		int r=q[0];//diznin ilk elemanini disariya atma işlemidir
		
		for (int i = 0; i < es-1; i++) //diziyi kaydirma işlemi amk
		{
			q[i]=q[i+1];//ilk ilemani ikinicie atiyor
		}
		es--;//dizinin boyutunu 1 azaltip son elemani da 0 atama işlemi yapiyor
		q[es]=0;//dizi 0 a esitse o dizi bos anlamindadir yani dizinin son elemanini 0 a esitlioyr
		return r;
	}
	
	public void yazma() {
		System.out.println(Arrays.toString(q));
	}
	
	
}
