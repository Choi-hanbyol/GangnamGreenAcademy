package ch12;

public class SuperConParent {
	private int a;
	private int b;
	
	public SuperConParent(int a, int b) { //생성자, 파라메터로 전달받은 멤버변수 초기화
		System.out.println("SuperConParent의 생성자");
		this.a=a;
		this.b=b;
	}
	
	public void print() { //멤버변수 a,b 출력
		System.out.println("a="+a+", b="+b);
	}
}