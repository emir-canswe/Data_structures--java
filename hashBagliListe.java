package hashkonu;
//buranin amaci bir alana iki tane sayi geliyorsa orayi bali liste sekdile getirip iki tayiyi ekleme
public class mainhash {
    
    // Bağlı listedeki düğüm (node) sınıfı
    static class node{
        int data;
        node next;

        public node(int a) {
            this.data = a;  // sayi eklemek için yapilan işlem
            this.next = null;//
        }
    }
    
    // Listenin sonuna eleman ekleme fonksiyonu
    public static node addToList(node head, int value) {
        
        if (head == null) {//eger eklemek istediin kisimda baska sayi yoksa otomatik gec
            return new node(value);//ama sayi varsa asagidan listenin sonuna gidip oraya ekleme yapacaksin
        }

        node current = head;//
        while (current.next != null) {//işin asli burada birden fazla bagli liste olusturoyorsun be sonra arama olan kisma eklemeler yapacaksin
            current = current.next;
        }

        current.next = new node(value);
        return head;
    }

    public static void main(String[] args) {

        int[] data = {7, 9, 3, 8, 6, 4, 2, 1, 0};//eklemek istedigim sayilar
        int tableSize = 5;//mod alacagim sayilar ya sayilari eklemek istedigim alanin boyutu

        node[] hashTable = new node[tableSize];//5 tane dugum olusturlacak yani tablesize kadar

        // Verileri tabloya ekle//datadaki her bir degeri teker teker alip modlarina gore indexlere ata
        for (int value : data) {
            int hash = value % tableSize;//girilen sayinin modunu al
            hashTable[hash] = addToList(hashTable[hash], value);//ikisini birlikte addtolliste ekle
        }

        // Hash tablosunu yazdır//tabloyu yazdirma işlemi
        for (int i = 0; i < tableSize; i++) {
            System.out.print(i + ": ");

            node current = hashTable[i];

            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }

            System.out.println("null");
        }
    }
}
