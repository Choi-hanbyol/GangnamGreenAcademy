package ch13;

public class Child extends Parent{
	public String hobby;
	
	@Override
	public void print() {//Parent���� ������ print�� Child�� �°� ������
		System.out.println("child");
		System.out.println("name = "+name);
		System.out.println("age = "+age);
	}
	
	@Override
	public void test() { //��ӹ��� �߻�޼��� test�� ����
		System.out.println("hobby = "+hobby);
	}
	
	public void parentPrint() { 
		/*�� Ŭ�������� �������� ����Ŭ������ �޼��带 ȣ��
		 �����ǵ� Ŭ������ �޼��带 ���� Ŭ�������� ȣ���Ϸ��� super �̿�*/
		super.print();
	}
}