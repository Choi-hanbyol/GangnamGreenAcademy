package ch13;
import java.util.Scanner;;

public class Q13_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������ �Է�");
		System.out.println("���� 1 : "); int a = sc.nextInt();
		System.out.println("���� 2 : "); int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a+"��(��) ũ��");
		}
		else if(a<b) {
			System.out.println(b+"��(��) ũ��");
		}
		else {
			System.out.println(a+"��(��)"+b+"�� ����");
		}
	}
}