package ch4;
import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("���ϴ� �ܼ� �Է�:");
		int dan= sc.nextInt();
		//int dan=3;
		for(i=1; i<10; i++) {
			System.out.println( dan+ " X "+ i +" = " +dan*i);
		}
		

	}

}