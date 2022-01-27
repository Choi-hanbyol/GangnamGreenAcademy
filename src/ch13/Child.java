package ch13;

public class Child extends Parent{
	public String hobby;
	
	@Override
	public void print() {//Parent에서 구현한 print를 Child에 맞게 재정의
		System.out.println("child");
		System.out.println("name = "+name);
		System.out.println("age = "+age);
	}
	
	@Override
	public void test() { //상속받은 추상메서드 test를 구현
		System.out.println("hobby = "+hobby);
	}
	
	public void parentPrint() { 
		/*이 클래스에서 재정의한 상위클래스의 메서드를 호출
		 재정의된 클래스의 메서드를 하위 클래스에서 호출하려면 super 이용*/
		super.print();
	}
}