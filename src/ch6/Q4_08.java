//�Է��� ������ ��� ����� �� ������ ǥ���Ͻÿ�.
package ch6;

import java.util.Scanner;

public class Q4_08 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int a = sc.nextInt();
		System.out.println(a+"�� �����");
		for(int i=1; i<=a; i++) {
			
			if(a%i==0) {
				System.out.println(i+" ");
				count++;
			}	
		}
		System.out.println(a+"�� ����� �� ������ "+count+"�� �Դϴ�.");
	}
	
}
