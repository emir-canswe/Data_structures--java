package cift_yonlu_bagli_liste;

import classs.classass;
import classs.classass2;

public class maiiin {
    public static void main(String[] args) {

        // Listeyi yönetecek class oluşturulur
        classass liste = new classass();

        // 6 adet düğüm oluşturulur
        classass2 k = new classass2(23);
        classass2 k1 = new classass2(3);
        classass2 k2 = new classass2(3243);
        classass2 k3 = new classass2(2234);
        classass2 k4 = new classass2(21343);
        classass2 k5 = new classass2(2424);

        // Düğümler listeye eklenir
        liste.sonaEkle(k);
        liste.yazdir();

        liste.sonaEkle(k1);
        liste.yazdir();

        liste.basaEkle(k2);
        liste.yazdir();

        liste.sonaEkle(k3);
        liste.yazdir();

        liste.basaEkle(k4);
        liste.yazdir();

        liste.sonaEkle(k5);
        liste.yazdir();
    }
}
