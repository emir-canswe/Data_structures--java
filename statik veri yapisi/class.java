package diziler;

import java.nio.channels.NotYetBoundException;
import java.util.Iterator;

public class dizii {
	int [] dizi;//burada bir dizi tanimlama islemidi
	int es;//dizinin  eleman sayisini belitren kod blogu
	
	
	public dizii(int boyut) {//ctrl tab spice kullanarak olusturluan bir yapici method
		
		dizi=new int[boyut];//girilen dizi int turunde ve boyut degişkeni kadar bir boyuta sahip
		
		es=0;//boytu baslangicta 0 olarak ata
	}
	
	public void ekleme(int a) {
		if (es>=dizi.length)//eger dizinin buyutu buradandaha buyuk ise bu kosulu sagla
		{
			System.out.println("dizi dolu");
		}
		else 
		{
			dizi[es++]=a;//gelen her bir sayiyi diiziye ata
		}
		
	}
	public int arama(int a) 
	{
		for (int i = 0; i < dizi.length; i++) 
		{
			if (dizi[i]==a)//aranan sayi bullunduysa dondur
			{
				return i+1;//aranan sayinin konumunu sana dogrusala arama yondetemi ile bulmani saglar
			}
		}
		return -1;//aranana sayi bulunamadi ise bu 
	} 
	public void sil(int a) {
		
		int indis=this.arama(a);
		if (indis==-1) {
			System.out.println("silmek istedigin sayi bulunamadi");
		}
		else 
		{
			for (int i = indis; i < es-1; i++) 
			{
				dizi[i]=dizi[i+1];
			}
			dizi[--es]=0;
		}
	}
	public void guncelle(int eski,int yeni) {
		int indis=this.arama(eski);
		if (indis==-1) 
		{
			System.out.println("guncellemek istedigin sayi bulunamadi");
		}
		else 
		{
			dizi[indis]=yeni;
		}	
	}
	
	public void yazma() {
		System.out.println("[");
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i]+"-");
		}
		System.out.println("]");
	}
}
