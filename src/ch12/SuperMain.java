package ch12;

public class SuperMain {
	public static void main(String[] args) {
		SuperParent sp = new SuperChild();
		sp.print();
	}/*���� Ŭ������ SuperChild�� print()�� SuperCall�� ȣ����
	���� Ŭ������ ��������� ����ϰ� �޼��带 ȣ��*/
}