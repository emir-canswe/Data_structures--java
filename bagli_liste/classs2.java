package clllaassass;

public class cllllas2 {
	public clllas head;  // Listenin başı
	int es;              // Eleman sayısı (şu an kullanılmıyor ama istersen kullanabilirsin)
	
	public void add(clllas n) {
		if (head == null) { // Liste boşsa ilk düğüm olarak ekle
			head = n;
		} else {
			clllas c = head;
			while (c.next != null) { // Listenin sonuna kadar git
				c = c.next;
			}
			c.next = n; // Son düğümün next'ine yeni düğümü bağla
		}
	}
	
	public void yazma() {
		clllas c = head;
		if (c == null) {
			System.out.println("Liste boş!");
			return;
		}
		System.out.print("Liste: ");
		while (c != null) { // Listenin sonuna kadar git ve verileri yazdır
			System.out.print(c.data + " ");
			c = c.next;
		}
		System.out.println(); // Yeni satıra geç
	}
}
