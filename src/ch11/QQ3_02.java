//�������� ��� ������ ���ϴ� ���α׷� �ۼ�
package ch11;
import java.util.Scanner;
public class QQ3_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int a = sc.nextInt();
		// int abs;
		if(a>0) {
			//abs=a;
			System.out.println(a+"�� ������ : "+a); //a ��� abs�� ���� ����
		}
		if(a<0) {
			//abs=-a
			System.out.println(a+"�� ������ : "+(-a)); //a ��� abs�� ���� ����
		}

	}

}