package ch10;

public class PublicTest {
	public int x;
	private int y;
	
	public PublicTest(int x, int y) {
		this.x=x;
		this.y=y; //private ���.Ŭ���� �ȿ����� ���� ����
	}
	
	public void print() {
		setValue(); //private ���ȣ��.Ŭ���� �ȿ����� ���� ����
		System.out.println("x = "+x+", y = "+y);
	}
	
	private void setValue() {
		x=100;
		y=100;
	}
}