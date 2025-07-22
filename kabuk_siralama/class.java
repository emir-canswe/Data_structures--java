package claslar;

import java.util.Arrays;

public class class1 {

    public int[] d;

    // Constructor: d dizisini alır
    public class1(int[] d) {
        this.d = d;
    }

    // 🔁 Kabuk (Shell) sıralama algoritması
    public void kabuk_siralama() {
        int n = d.length;

        // Başlangıçta aralık (gap) dizinin yarısı kadar
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // Gap'li insertion sort uygulanır
            for (int i = gap; i < n; i++) {
                int temp = d[i];
                int j;

                // Gap kadar geriye giderek karşılaştırma yapılır
                for (j = i; j >= gap && d[j - gap] > temp; j -= gap) {
                    d[j] = d[j - gap]; // Elemanlar kaydırılır
                }

                d[j] = temp; // Doğru pozisyona yerleştirilir
            }
        }
    }

    // 📤 Diziyi ekrana yazdırır
    public void yazma() {
        System.out.println(Arrays.toString(d));
    }
}
