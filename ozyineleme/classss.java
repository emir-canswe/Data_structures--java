package classlar;

public class clas1 {

	
	public int test(int a) {
		if (a==0) {
			return 0;
		}
		else if (a<4) {
			return 1;
		}
		
		return test(a-1)+test(a-2);
	}
}
