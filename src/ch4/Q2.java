package ch4;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		System.out.println("�����Է� : ");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		char grade=(score>90) ? 'A' : ((score>80)?'B' : 'C');
		System.out.println(score+"����"+grade + "����Դϴ�.");
	}

}