package ch7;

public class StudentMain2 {

	public static void main(String[] args) {
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		
		s3.name = "���缮";
		s3.kor = 70;
		s3.eng = 80;
		s3.math = 90;
		s3.eval_sum();
		s3.eval_avg();
		System.out.println("��ü s3�� ����");
		s3.print();
		
		s4.name = "�ڸ��";
		s4.kor = 100;
		s4.eng = 80;
		s4.math = 76;
		s4.eval_sum();
		s4.eval_avg();
		System.out.println("��ü s4�� ����");
		s4.print();
		
		s5.name = "��ȣ��";
		s5.kor = 100;
		s5.eng = 100;
		s5.math = 100;
		s5.eval_sum();
		s5.eval_avg();
		System.out.println("��ü s5�� ����");
		s5.print();
	}
}