package yıgıt_kuyruk;

import classs.claass;

public class maiin {
//yigitin genel mantigi son gelen eleman diziden ilk cikan eleman olur
	public static void main(String[] args) {
		claass d=new claass(5);
		
		d.push_yigit(23);//ekleme işlemleri
		d.push_yigit(2);
		d.push_yigit(2233);
		d.push_yigit(22342);
		d.push_yigit(342);
		d.push_yigit(2234682);
		d.yazma();
		d.yazma();
	int a=d.pop_yigit();//cikarilan son işlemi main ile disariya aktarma işlemi
	d.yazma();
	System.out.println("dizinin son elemani :"+a);

	}

}

