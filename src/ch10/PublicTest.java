package ch10;

public class PublicTest {
	public int x;
	private int y;
	
	public PublicTest(int x, int y) {
		this.x=x;
		this.y=y; //private 멤버.클래스 안에서는 접근 가능
	}
	
	public void print() {
		setValue(); //private 멤버호출.클래스 안에서는 접근 가능
		System.out.println("x = "+x+", y = "+y);
	}
	
	private void setValue() {
		x=100;
		y=100;
	}
}