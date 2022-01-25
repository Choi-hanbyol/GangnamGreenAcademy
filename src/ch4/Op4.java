package ch4;

public class Op4 {

	public static void main(String[] args) {
		int a=10, b=20;
		
		//&&
		System.out.println(a==10 && b==20);
		System.out.println(a>10 && b==20);
		System.out.println(a==10 && b==10);
		System.out.println(a<10 && b>20);
		System.out.println();
		//||
		System.out.println(a==10 || b==20);
		System.out.println(a>10 || b==20);
		System.out.println(a==10 || b==10);
		System.out.println(a<10 || b>20);

	}

}