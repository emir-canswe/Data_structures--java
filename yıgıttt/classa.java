
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

	

	
	public void push_yigit(int a) {
		if (es==q.length) {
			System.out.println("yigit dolu");
		}
		else {
			q[es]=a;//yigir ile kuyrukra diziye ekleme işlemleri aynidir
			es++;//es indexsine sayi eklemesi yapiildiktan sonra indexi 1 artir
		}
	}
//javada bir dizi 0 ise o indexs bostur
	public int pop_yigit() {//kuyruktan cikarma işlemi
		int r=q[es-1];//diznin ilk elemanini disariya atma işlemidir
		es--;
		q[es]=0;//son indexi 0 a esitleme 
		return r;
	}
	
	public void yazma() {
		System.out.println(Arrays.toString(q));
	}
	
	
}
