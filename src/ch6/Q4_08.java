//입력힌 정수의 모든 약수와 그 개수를 표시하시오.
package ch6;

import java.util.Scanner;

public class Q4_08 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int a = sc.nextInt();
		System.out.println(a+"의 약수는");
		for(int i=1; i<=a; i++) {
			
			if(a%i==0) {
				System.out.println(i+" ");
				count++;
			}	
		}
		System.out.println(a+"의 약수의 총 갯수는 "+count+"개 입니다.");
	}
	
}
