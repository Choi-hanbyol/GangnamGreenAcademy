package ch7;

public class ProductMain2 {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.num=1;
		p1.name="��Ʈ��";
		
		System.out.println("��ü p1�� ���� ���");
		p1.print();
		
		Product p2 = new Product();
		p2.num=2;
		p2.name="TV";
		
		System.out.println("��ü p2�� ���� ���");
		p2.print();
		
		Product p3 = new Product();
		p3.num=3;
		p3.name="�����";
		
		System.out.println("��ü p3�� ���� ���");
		p3.print();
	}

}