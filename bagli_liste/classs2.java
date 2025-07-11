package clllaassass;





public class cllllas2 {
	public clllas head;  // Listenin başı
	int es;              // Eleman sayısı (şu an kullanılmıyor ama istersen kullanabilirsin)




	//sone ekleme islemi
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
	
	


	
	public void silme(int d) {//silinmek istenilen deger
		if (head==null) {//liste bos ise
			System.out.println("liste bos");
		}
		else if (head.data==d) {//ilk eleman silinecek ise
			head=head.next;//bas dugumu basin sonraki dugumune ata
		}
		else {
			clllas c=head;//gecici dugum atamasi yap
			while (c.next!=null) {//kosul
				if (c.next.data==d) {//silmek istedigin deger c.next.datasine esit ise
					c.next=c.next.next;//next degeri bir sonraki dugumu aata,
				}
				c=c.next;
			}
		}
	}



	
	//listeye sirali bir sekilde ekleme işlemi
	public void addinorder(clllas n) {//listeye sirali bir skidle ekleme
		if (head==null) {
			head=n;//eger bas dugumu bos ise yani liste bos ise gelen dugumu basa ekle
		}
		else if (head.data>n.data) {
			n.next=head;
			head=n;
		}
		else {
			clllas c=head;
			while (c.next!=null && c.next.data<n.data) {
				c=c.next;
			}
			n.next=c.next;
			c.next=n;
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
