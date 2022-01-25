package ch4;

public class Q7 {

	public static void main(String[] args) {
		int i;
		
		System.out.println("1~100±îÁö Â¦¼ö");
		
		for (i=1; i<=100; i++) {
			if(i%2 == 0) {
				System.out.print(i+"\t");
			}
			if(i%10 == 0) {
				System.out.println();
			}
			
		}

	}

}
