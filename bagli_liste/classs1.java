package clllaassass;

public class clllas {
	
	public int data;      // Düğümde tutulacak veri
	public clllas next;   // Sonraki düğüme referans
	
	public clllas(int d) {
		data = d;         // Veri atanıyor
		next = null;      // Başlangıçta sonraki düğüm yok
	}
	
	@Override
	public String toString() {
		return String.valueOf(data); // Ekrana yazdırıldığında sadece veriyi göster
	}
}
