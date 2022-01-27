package ch12;

public class SuperConChild extends SuperConParent{
	private int c;
	
	public SuperConChild(int a, int b, int c) {
		super(a,b); //상위 클래스의 생성자를 호출하여 파라미터 전달
		System.out.println("SuperConChild의 생성자");
		this.c=c;
	}
	
	public void print() {
		super.print(); //상위클래스의 print()를 실행한뒤 재정의된 코드를 실행
		System.out.println("c="+c);
	}
}