//정숫값을 읅어서 절댓값을 구하는 프로그램 작성
package ch11;
import java.util.Scanner;
public class QQ3_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int a = sc.nextInt();
		// int abs;
		if(a>0) {
			//abs=a;
			System.out.println(a+"의 절댓값은 : "+a); //a 대신 abs에 절댓값 저장
		}
		if(a<0) {
			//abs=-a
			System.out.println(a+"의 절댓값은 : "+(-a)); //a 대신 abs에 절댓값 저장
		}

	}

}