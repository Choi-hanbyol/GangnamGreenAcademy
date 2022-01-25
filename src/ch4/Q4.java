package ch4;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 입력 : ");
		int i= sc.nextInt();
		
		if(i>0) {
			System.out.println("입력한 정수 "+i+"은 양수 입니다.");
		}
		else if(i<0) {
			System.out.println("입력한 정수 "+i+"은 음수 입니다.");
		}
		else {
			System.out.println("입력한 정수 "+i+"은 0 입니다.");
		}
		
	}
}
