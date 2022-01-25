package ch9;

public class InitMethod {
	int x = initMember();
	static int y = initMember_s();
	
	final int initMember() {
		return 10;
	}
	
	static int initMember_s() {
		return 10;
	}
	
	InitMethod(){
		System.out.println("积己磊 角青 傈");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		x=20;
		y=20;
	}
	
	void print() {
		System.out.println("积己磊 角青 饶");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}