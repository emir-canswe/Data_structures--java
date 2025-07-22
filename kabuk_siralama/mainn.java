package kabuk_siralama;

import java.util.Arrays;
import claslar.class1;

public class maiiinnn {

    public static void main(String[] args) {

        int[] d = {12, 3, 4, 5, 67, 67, 8};

        System.out.println("Orijinal dizi: " + Arrays.toString(d)); // Orijinal diziyi yazdırır

        class1 name = new class1(d); // class1 sınıfından nesne oluşturur
        name.kabuk_siralama(); // Kabuk sıralama işlemi yapar
        System.out.print("Sıralı dizi: ");
        name.yazma(); // Sıralanmış diziyi yazdırır
    }
}
