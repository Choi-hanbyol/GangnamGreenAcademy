package ch12;

public class SuperMain {
	public static void main(String[] args) {
		SuperParent sp = new SuperChild();
		sp.print();
	}/*하위 클래스인 SuperChild의 print()는 SuperCall을 호출해
	상위 클래스의 멤버변수를 출력하고 메서드를 호출*/
}