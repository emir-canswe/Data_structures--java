package classs;

// Bu sınıf çift yönlü bağlı listeyi yönetir.
public class classass {

    classass2 head; // Listenin başı
    classass2 tail; // Listenin sonu

    // Constructor: Liste başta boştur
    public classass() {
        head = null;
        tail = null;
    }

    // Listenin başına düğüm ekler
    public void basaEkle(classass2 n) {
        if (head == null) {
            head = n;
            tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    // Listenin sonuna düğüm ekler
    public void sonaEkle(classass2 n) {
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    // Listeyi baştan sona yazdırır
    public void yazdir() {
        classass2 temp = head;
        System.out.print("Liste: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // 🔴 Listenin başındaki düğümü siler
    public void bastanSil() {
        if (head == null) {
            System.out.println("Liste zaten boş.");
            return;
        }

        if (head == tail) { // Tek eleman varsa
            head = null;
            tail = null;
        } else {
            head = head.next; // Baş, bir sonraki düğüme geçer
            head.prev = null; // Yeni başın prev'i null yapılır
        }
        System.out.println("Baştan silindi.");
    }

    // 🔴 Listenin sonundaki düğümü siler
    public void sondanSil() {
        if (tail == null) {
            System.out.println("Liste zaten boş.");
            return;
        }

        if (head == tail) { // Tek eleman varsa
            head = null;
            tail = null;
        } else {
            tail = tail.prev; // Son, bir önceki düğüme geçer
            tail.next = null; // Yeni sonun next'i null yapılır
        }
        System.out.println("Sondan silindi.");
    }

    // 🔴 Verilen veriyi içeren ilk düğümü siler
    public void aradanSil(int veri) {
        if (head == null) {
            System.out.println("Liste boş, silinecek eleman yok.");
            return;
        }

        classass2 temp = head;

        // Baştaki eleman silinecekse
        if (temp.data == veri) {
            bastanSil();
            return;
        }

        // Ortada ya da sonda aranır
        while (temp != null) {
            if (temp.data == veri) {
                // Sondaki eleman mı?
                if (temp == tail) {
                    sondanSil();
                    return;
                }

                // Ortada bir eleman
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                System.out.println("Aradan silindi: " + veri);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Eleman bulunamadı: " + veri);
    }
}
