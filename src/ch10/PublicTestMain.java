package ch10;

public class PublicTestMain {

	public static void main(String[] args) {
		PublicTest t = new PublicTest(10, 10);
		t.x=20; //public ����� Ŭ���� �ۿ��� ���� ����
		//t.y=20; private ����̱� ������ Ŭ���� �ۿ����� ���� �Ұ�
		//t.setValue()  ���. ���� �Ұ�
		t.print(); //public ���.���� ����
	}
}