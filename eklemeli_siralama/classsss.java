package eklemekli_siralama;

import java.util.Arrays;

public class clas {
	int [] array;
	
	public clas(int [] dizi) {
		array=dizi;
	}
	
	public void arrangamet() {
		int t=0,i=0,j=0;
		
		for ( i = 0; i < array.length; i++) {
			t=array[i];
			
			for ( j = i; j>0 && array[j-1]>t; j--) {
				array[j]=array[j-1];
			}
			array[j]=t;
		}
	}
	
	public void write() {
		System.out.println(Arrays.toString(null));
	}

}
