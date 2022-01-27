package ch13;
import java.util.Scanner;;

public class Q13_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력");
		System.out.println("정수 1 : "); int a = sc.nextInt();
		System.out.println("정수 2 : "); int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a+"이(가) 크다");
		}
		else if(a<b) {
			System.out.println(b+"이(가) 크다");
		}
		else {
			System.out.println(a+"와(과)"+b+"는 같다");
		}
		
		

	}

}
