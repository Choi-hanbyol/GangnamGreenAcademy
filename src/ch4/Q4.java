package ch4;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է� : ");
		int i= sc.nextInt();
		
		if(i>0) {
			System.out.println("�Է��� ���� "+i+"�� ��� �Դϴ�.");
		}
		else if(i<0) {
			System.out.println("�Է��� ���� "+i+"�� ���� �Դϴ�.");
		}
		else {
			System.out.println("�Է��� ���� "+i+"�� 0 �Դϴ�.");
		}
		
	}
}
