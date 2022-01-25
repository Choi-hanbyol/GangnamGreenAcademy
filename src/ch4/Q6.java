package ch4;

public class Q6 {

	public static void main(String[] args) {
		int i, sum=0;
		
		System.out.println("1~10000±îÁö ÇÕ");
		for(i=1; i<=10000; i++) {
			sum=sum+i; //sum+=i;
		}
		System.out.println("="+ sum);

	}

}
