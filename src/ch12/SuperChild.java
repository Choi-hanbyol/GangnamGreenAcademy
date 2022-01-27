package ch12;

public class SuperChild extends SuperParent {
	private int a=20;/*상속받은 필드를 또 선언하면 하위 클래스에서 상위클래스의 필드는 숨겨진다.*/
	
	public void print() {//상속받은 print 재정의
		System.out.println("SuperChild의 print()");
		System.out.println("a="+a+"\n");
		SuperCall();
	}
	//12~15는 상위클래스의 필드와 메서드에 접근하는 메서드
	public void SuperCall() {
		System.out.println("super.a="+super.a);//SuperParent의 a
		super.print();//SuperParent의 print()
	}
}