/*2���� ���� ������ �Է�, ���ڰ� ������ ����̸� "B�� A�� ����̴�."��� ���,
�׷��� ������ "B�� A�� ����� �ƴϴ�."��� ����ϴ� ���α׷� �ۼ�*/
package ch12;
import java.util.Scanner;
public class Q12_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ������ �Է�");
		System.out.println("����1 : ");
		int a = sc.nextInt();
		System.out.println("����2 : ");
		int b = sc.nextInt();
		if(a%b==0) System.out.println(b+"��(��) "+a+"�� ��� �Դϴ�.");
		else if(a%b!=0) System.out.println(b+"��(��) "+a+"�� ����� �ƴմϴ�.");
	}
}