/*2개의 양의 정수를 입력, 후자가 전자의 약수이면 "B는 A의 약수이다."라고 출력,
그렇지 않으면 "B는 A의 약수가 아니다."라고 출력하는 프로그램 작성*/
package ch12;
import java.util.Scanner;
public class Q12_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 양의 정수를 입력");
		System.out.println("정수1 : ");
		int a = sc.nextInt();
		System.out.println("정수2 : ");
		int b = sc.nextInt();
		if(a%b==0) System.out.println(b+"는(은) "+a+"의 약수 입니다.");
		else if(a%b!=0) System.out.println(b+"는(은) "+a+"의 약수가 아닙니다.");
	}
}