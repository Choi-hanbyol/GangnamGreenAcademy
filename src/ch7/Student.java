package ch7;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float avg;
	
	void eval_sum() {
		sum=kor+eng+math;
	}
	
	void eval_avg() {
		avg=(float) sum/3;
	}
	
	void print() {
		System.out.println("?̸? : "+name);
		System.out.println("???? : "+kor);
		System.out.println("???? : "+eng);
		System.out.println("???? : "+math);
		System.out.println("???? : "+sum);
		System.out.println("???? : "+avg);
		
	}
	
}
