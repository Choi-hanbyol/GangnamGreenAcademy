package ch4;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		System.out.println("점수입력 : ");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		char grade=(score>90) ? 'A' : ((score>80)?'B' : 'C');
		System.out.println(score+"점은"+grade + "등급입니다.");
	}

}